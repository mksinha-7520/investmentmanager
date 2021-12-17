package com.service.investmentmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private Integer customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "password")
	private String password;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
