package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int minium;
	private int maximum;
	public int getMinium() {
		return minium;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
