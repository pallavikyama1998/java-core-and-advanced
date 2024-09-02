package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5"); // Principal Amount,
																								// Interest rate
		BigDecimal totalAmount = calculator.calculateTotalAmount(5); // NoOfYears
		System.out.println(totalAmount);

	}

}
