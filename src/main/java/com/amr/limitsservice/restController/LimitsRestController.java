package com.amr.limitsservice.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amr.limitsservice.dto.Limits;
import com.amr.limitsservice.dto.LimitsServiceConfiguration;

@RestController
@RequestMapping("limits-service")
public class LimitsRestController {
	
	private LimitsServiceConfiguration configuration;
	
	public LimitsRestController(LimitsServiceConfiguration configuration) {
		this.configuration = configuration;
	}

	@GetMapping("getLimits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
