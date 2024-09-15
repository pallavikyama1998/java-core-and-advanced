package com.in28minutes.coding.exercises.set6.q33;

public class NumberMagicRunner {

	public static void main(String[] args) {
		NumberMagic numberMagic = new NumberMagic();

		int number = 6;
		System.out.println("Factors of " + number + " are: " + numberMagic.determineAllFactors(number));

		int number2 = 12;
		System.out.println("Factors of " + number2 + " are: " + numberMagic.determineAllFactors(number2));

		int number3 = 15;
		System.out.println("Factors of " + number3 + " are: " + numberMagic.determineAllFactors(number3));
	}

}
