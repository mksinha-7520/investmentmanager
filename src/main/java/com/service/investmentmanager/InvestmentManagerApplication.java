package com.service.investmentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class InvestmentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentManagerApplication.class, args);
	}

}
