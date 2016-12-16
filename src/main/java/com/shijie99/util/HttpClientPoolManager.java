package com.shijie99.util;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpClientPoolManager {
	public static PoolingHttpClientConnectionManager clientConnectionManager = null;
	private static HttpClientPoolManager poolManager = null;
	
	private int maxTotal = 200;

	private int defaultMaxPerRoute = 100;

	private HttpClientPoolManager(int maxTotal, int defaultMaxPerRoute) {
		this.maxTotal = maxTotal;
		this.defaultMaxPerRoute = defaultMaxPerRoute;
		clientConnectionManager.setMaxTotal(maxTotal);
		clientConnectionManager.setDefaultMaxPerRoute(defaultMaxPerRoute);
	}

	private HttpClientPoolManager() {
		clientConnectionManager.setMaxTotal(maxTotal);
		clientConnectionManager.setDefaultMaxPerRoute(defaultMaxPerRoute);
	}

	public synchronized static HttpClientPoolManager getInstance() {
		if (poolManager == null) {
			clientConnectionManager = new PoolingHttpClientConnectionManager();
			poolManager = new HttpClientPoolManager();
		}

		return poolManager;
	}

	public synchronized static HttpClientPoolManager getInstance(int maxTotal,
			int defaultMaxPerRoute) {
		if (poolManager == null) {
			clientConnectionManager = new PoolingHttpClientConnectionManager();
			poolManager = new HttpClientPoolManager(maxTotal,
					defaultMaxPerRoute);
		}

		return poolManager;
	}

	public static CloseableHttpClient getHttpClient() {
		if (poolManager == null) {
			getInstance();
		}

		return HttpClients.custom()
				.setConnectionManager(clientConnectionManager).build();
	}
}
