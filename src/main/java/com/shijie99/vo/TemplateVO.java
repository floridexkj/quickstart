package com.shijie99.vo;

import java.util.concurrent.TimeUnit;

public class TemplateVO {
	private String template;

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "TemplateVO [template=" + template + "]";
	}
	
	public static void main(String[] args) {
		TimeUnit.NANOSECONDS.toNanos(System.currentTimeMillis());
	}
}
