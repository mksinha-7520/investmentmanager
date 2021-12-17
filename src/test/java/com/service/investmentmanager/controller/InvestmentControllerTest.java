package com.service.investmentmanager.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = InvestmentController.class)
public class InvestmentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	private static final int HTTP_SUCCESS_STATUS = 200;

	@Test
	public void testLandingController() throws Exception {

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/api/customers/1/accounts");

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		assertEquals(HTTP_SUCCESS_STATUS, result.getResponse().getStatus());
	}

}
