package com.service.investmentmanager.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.investmentmanager.util.LoginValidatorUtil;

@RestController
public class InvestmentLandingController {

	private static String investmentLandingPageResource = "http://localhost:8080/api/customers/1/accounts";

	private final static Logger LOGGER = Logger.getLogger(InvestmentLandingController.class.getName());

	@GetMapping("/investment")
	public String getInvestmentDetails() {

		LOGGER.info("*******Taking to the Investment Landing Page.********");
		LOGGER.info("Logged In User is ** " + LoginValidatorUtil.returnLoggedInUser());

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(investmentLandingPageResource, String.class);

		return result;

	}

}
