package com.macnell.propertyservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class CustomProperties {
	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
