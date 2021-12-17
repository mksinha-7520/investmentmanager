package com.service.investmentmanager.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.investmentmanager.service.RedirectAccountPageService;
import com.service.investmentmanager.util.LoginValidatorUtil;

@RestController
public class LandingPageController {

	private final static Logger LOGGER = Logger.getLogger(LandingPageController.class.getName());

	@Autowired
	RedirectAccountPageService redirectAccountPageService;

	@GetMapping("/investment")
	public ResponseEntity<String> getInvestmentDetails() {

		LOGGER.info("*******Taking to the Investment Landing Page.********");

		LOGGER.info("Logged in username ** " + LoginValidatorUtil.returnLoggedInUser());

		String accountDetails = redirectAccountPageService.getInvestmentAcocunts();

		return new ResponseEntity<String>(accountDetails, HttpStatus.OK);
	}
}
