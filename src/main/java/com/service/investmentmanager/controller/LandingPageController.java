package com.service.investmentmanager.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.investmentmanager.util.LoginValidatorUtil;

@RestController
public class LandingPageController {

	private final static Logger LOGGER = Logger.getLogger(LandingPageController.class.getName());

	private static String investmentLandingPageResource = "http://localhost:8080/api/customers/1/accounts";

	@GetMapping("/investment")
	public String getInvestmentDetails() {

		LOGGER.info("*******Taking to the Investment Landing Page.********");

		LOGGER.info("Logged in username ** " + LoginValidatorUtil.returnLoggedInUser());

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(investmentLandingPageResource, String.class);

		return result;
	}
}
