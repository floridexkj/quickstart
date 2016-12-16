package com.shijie99.controller;

import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shijie99.service.BusinessService;
import com.shijie99.vo.TemplateVO;

/**
 * 控制器类
 * @author zhoucl
 */
@Controller
public class DemoController {
	private static final Logger logger = Logger.getLogger(DemoController.class);
	
	@Autowired
	BusinessService businessService;
	
	/**
	 * @param body 请求参数
	 * @return
	 */
	@RequestMapping(value = "/service", method = RequestMethod.POST)
	@ResponseBody
	public Object service(@RequestBody String body) {
		Object returnObj = null;
		
		try {
			if(logger.isDebugEnabled()) 
				logger.debug("请求参数:" + body.replaceAll("[\\t][\\r][\\n]", ""));
			
			logger.info(businessService.countFlightBook());
			
			int random = new Random().nextInt(2);
			if(random % 2 == 0) {
				RetMessage ret = new RetMessage();
				ret.setStatus(1);
				ret.setMessage("service ok");
				returnObj = ret;
			} else {
				TemplateVO vo = new TemplateVO();
				vo.setTemplate("template");
				returnObj = vo;
			}
		} catch (Exception e) {
			logger.error("service服务异常", e);
		}
		return returnObj;
	}
}

class RetMessage {
	private int status;
	private String message;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}