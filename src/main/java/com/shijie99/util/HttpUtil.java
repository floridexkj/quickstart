package com.shijie99.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.GzipCompressingEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * HttpUtil工具类，依赖httpclient
 * @author zhoucl
 */
public class HttpUtil {
	private static final Logger logger = Logger.getLogger(HttpUtil.class);
	
	public static final String ERROR_INFO = "SERVICE ERROR!";
	
	public static String transferByPostWithGzip(String url, String data) {
		if(logger.isDebugEnabled())
			logger.debug("transferByPostWithGzip, data=>" + data + ",url=>" + url);
		String ret = ERROR_INFO;
		CloseableHttpClient client = HttpClientPoolManager.getHttpClient();
		try {
			HttpPost post = new HttpPost();
			post.setURI(new URI(url));
			
			GzipCompressingEntity entity = new GzipCompressingEntity(
					new StringEntity(data, "UTF-8"));
			post.setEntity(entity);
			post.setHeader("Content-Type","text/html; charset=UTF-8");
			post.setHeader("Accept-Encoding", "gzip");
			CloseableHttpResponse response = client.execute(post);
			
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				ret = EntityUtils.toString(response.getEntity(), "UTF-8");
			} else {
				ret = ERROR_INFO + "ERROR CODE:" +  response.getStatusLine().getStatusCode();
			}
		} catch (ClientProtocolException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost ClientProtocolException:" + e.getMessage(), e);
		} catch (IOException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost IOException:" + e.getMessage(), e);
		} catch (URISyntaxException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost URISyntaxException:" + e.getMessage(), e);
		}
		
		return ret;
	}
	
	public static String transferByPost(String url, String data) {
		if(logger.isDebugEnabled())
			logger.debug("transferByPost, data=>" + data + ",url=>" + url);
		String ret = ERROR_INFO;
		CloseableHttpClient client = HttpClientPoolManager.getHttpClient();
		try {
			HttpPost post = new HttpPost();
			post.setURI(new URI(url));
			
			StringEntity entiy = new StringEntity(data, "UTF-8");
			post.setEntity(entiy);
			post.setHeader("Content-Type","text/xml");
			CloseableHttpResponse response = client.execute(post);
			
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				ret = EntityUtils.toString(response.getEntity()).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
			} else {
				ret = ERROR_INFO + "ERROR CODE:" +  response.getStatusLine().getStatusCode();
			}
		} catch (ClientProtocolException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost ClientProtocolException:" + e.getMessage(), e);
		} catch (IOException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost IOException:" + e.getMessage(), e);
		} catch (URISyntaxException e) {
			ret = ERROR_INFO + "ERROR MSG:" + e.getMessage();
			logger.error("transferByPost URISyntaxException:" + e.getMessage(), e);
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws Exception {
		final String data = "{ \"endtime\": \"2016-05-30\", \"starttime\": \"2016-05-22\", \"tradeid\": \"101\", \"fromto\": \"HKG-BJS\", \"uname\": \"admin\", \"tocity\": \"BJS\", \"dss\": \"UTOUR_F\", \"adult\": \"1\", \"cid\": \"alitripasl20151214\", \"flightClass\": \"Economy\", \"validtime\": \"\", \"guid\": \"1268\", \"child\": \"0\", \"pwd\": \"shijie99\", \"fromcity\": \"HKG\", \"flag\": \"0\", \"flightOption\": \"roundTrip\", \"ds\": \"UTOUR_F\" }";
		final String url = "http://192.168.6.164:8105/CharteredAirPlaneGDS/service";
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 1000; i++) {
			final int index = i;
			service.submit(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					long start = System.currentTimeMillis();
					String ret = HttpUtil.transferByPostWithGzip(url, data);
					System.out.println(index + "====>[" + (System.currentTimeMillis() - start) + "]====>" + ret);
					return false;
				}
			});
		}
		
		service.shutdown();
	}
}
