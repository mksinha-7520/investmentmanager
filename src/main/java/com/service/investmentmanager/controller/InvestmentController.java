package com.service.investmentmanager.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class InvestmentController {

	private final static Logger LOGGER = Logger.getLogger(InvestmentController.class.getName());

	@GetMapping("/customers/1/accounts")
	public String getInvestmentAndAccountDetails() {

		LOGGER.info("*******Taking to the Investment And Account Details Landing Page.******** ");

		return "Welcome";
	}
}
