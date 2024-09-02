package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interestRate;

	public SimpleInterestCalculator(String principal, String interestRate) {
		this.principal = new BigDecimal(principal);
		this.interestRate = new BigDecimal(interestRate).divide(new BigDecimal("100"));
	}

	public BigDecimal calculateTotalAmount(int noOfYears) {
		BigDecimal interestAmount = principal.multiply(interestRate).multiply(new BigDecimal(noOfYears));
		return principal.add(interestAmount);
	}

}
