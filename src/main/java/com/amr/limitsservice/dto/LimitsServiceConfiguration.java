package com.amr.limitsservice.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")
public class LimitsServiceConfiguration {

	private Integer minimum;
	private Integer maximum;
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	@Override
	public String toString() {
		return "Configuration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
}
