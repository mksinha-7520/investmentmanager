package com.service.investmentmanager.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RedirectAccountPageService {

	private static String investmentLandingPageResource = "http://localhost:8080/api/customers/1/accounts";

	public String getInvestmentAcocunts() {
		String accountDetails = StringUtils.EMPTY;
		RestTemplate restTemplate = new RestTemplate();
		accountDetails = restTemplate.getForObject(investmentLandingPageResource, String.class);

		return accountDetails;
	}

}
