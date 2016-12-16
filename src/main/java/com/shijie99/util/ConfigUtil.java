package com.shijie99.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.shijie99.service.BusinessService;
import com.shijie99.service.PolicyService;

public class ConfigUtil {
	private static Logger logger = Logger.getLogger(ConfigUtil.class);
	
	private static BusinessService businessService;
	private static PolicyService policyService;
	
	private static String realPath =  "";
	private static Properties properties = new Properties();
	
	private static Map<String, String>  strStore = new HashMap<String, String>();
	
	public static Map<String, String> getStrStore() {
		return strStore;
	}

	public static void setPath(String path) {
		System.out.println(ConfigUtil.class.getClassLoader().getClass().getName());
		realPath = path;
		if (realPath.indexOf("standalone") > -1) {
			realPath = realPath.substring(0, realPath.indexOf("standalone"));
		}
		realPath += "standalone/config.properties";
		logger.info(String.format(
				"设置配置文件:[%s]成功!", realPath));
	}
	
	public static void reload() {
		//读取配置文件
		try {
			properties.clear();
			properties.load(new FileInputStream(realPath));
			logger.info(String.format(
				"加载配置文件:[%s]成功,共:%d条配置信息", realPath, properties.size()));
		} catch (Exception e) {
			logger.error(String.format("加载配置文件:[%s]失败!", realPath), e);
			return;
		}
		
		//分析配置文件并且加载相关简单配置信息
		setInfoWithString("filepath");
		setInfoWithString("jsonFilePath");
		setInfoWithString("isopenbigcoding");
		
		setInfoWithStringMap("logserver", strStore);
		setInfoWithStringMap("tgzc", strStore);
		setInfoWithStringMap("qunarenckey", strStore);
		
		//分析配置文件的缓存配置，并且初始化缓存配置
		
		//加载数据库信息
		logger.info("tpf.flight_book表记录数:" + businessService.countFlightBook());
		logger.info("policy.policy_agent_info表记录数:" + policyService.countPolicyAgent());
	}
	
	public static BusinessService getBusinessService() {
		return businessService;
	}

	public static void setBusinessService(BusinessService businessService) {
		ConfigUtil.businessService = businessService;
	}

	public static PolicyService getPolicyService() {
		return policyService;
	}

	public static void setPolicyService(PolicyService policyService) {
		ConfigUtil.policyService = policyService;
	}

	protected static void setInfoWithStringMap(String key, Map<String, String> store) {
		String value = "";
		if(properties.getProperty(key) != null 
				&& !properties.getProperty(key).trim().equals("")) {
			value = properties.getProperty(key).trim();
			store.put(key, value);
			logger.info("读取配置项[" + key + "]:[" + value + "]");
		} else {
			logger.warn("配置项[" + key + "]缺失,请增加配置确认后重启服务... ...");
			pause();
		}
	}
	
	protected static void setInfoWithIntMap(String key, Map<String, Integer> store) {
		String value = "";
		if(properties.getProperty(key) != null 
				&& !properties.getProperty(key).trim().equals("")) {
			value = properties.getProperty(key).trim();
			store.put(key, Integer.parseInt(value));
			logger.info("读取配置项[" + key + "]:[" + value + "]");
		} else {
			logger.warn("配置项[" + key + "]缺失,请增加配置确认后重启服务... ...");
			pause();
		}
	}
	
	protected static String setInfoWithString(String key) {
		String value = "";
		if(properties.getProperty(key) != null 
				&& !properties.getProperty(key).trim().equals("")) {
			value = properties.getProperty(key).trim();
			logger.info("读取配置项[" + key + "]:[" + value + "]");
		} else {
			logger.warn("配置项[" + key + "]缺失,请增加配置确认后重启服务... ...");
			pause();
		}
		
		return value;
	}
	
	protected static void pause() {
		try {
			TimeUnit.DAYS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
