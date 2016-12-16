package com.shijie99.convertor;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.shijie99.util.AESPlus;
import com.shijie99.util.ConfigUtil;
import com.shijie99.vo.TemplateVO;

/**
 * 生单/支付校验返回AES加密串返回转换类
 * @author zhoucl
 */
public class AESEncoderHttpMessageConverter extends
		FastJsonHttpMessageConverter {
	@Override
	protected void writeInternal(Object obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		if(obj instanceof TemplateVO) {
			OutputStream out = outputMessage.getBody();
	        String text = JSON.toJSONString(obj, getFeatures());
	        text = AESPlus.encrypt(ConfigUtil.getStrStore().get("qunarenckey"), 
	        		text);
	        byte[] bytes = text.getBytes(getCharset());
	        out.write(bytes);
		} else {
			super.writeInternal(obj, outputMessage);
		}
	}
}
