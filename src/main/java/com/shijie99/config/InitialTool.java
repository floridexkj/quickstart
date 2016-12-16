package com.shijie99.config;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;

import com.shijie99.service.BusinessService;
import com.shijie99.service.PolicyService;
import com.shijie99.util.ConfigUtil;

/**
 * 配置信息的工具类，在spring-mybatis文件的bean中配置
 * @author zhoucl
 */
public class InitialTool implements InitializingBean, ApplicationContextAware{
	private static final Logger logger = Logger.getLogger(InitialTool.class);
	
	protected WebApplicationContext applicationContext;
	
	BusinessService businessService;
	
	PolicyService policyService;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		//初始化加载的内容
		logger.debug("afterPropertiesSet");
		ConfigUtil.setPath(applicationContext.getServletContext().getRealPath("/"));
		ConfigUtil.setBusinessService(businessService);
		ConfigUtil.setPolicyService(policyService);
		ConfigUtil.reload();
	}

	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public PolicyService getPolicyService() {
		return policyService;
	}

	public void setPolicyService(PolicyService policyService) {
		this.policyService = policyService;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = (WebApplicationContext)applicationContext;
	}
}