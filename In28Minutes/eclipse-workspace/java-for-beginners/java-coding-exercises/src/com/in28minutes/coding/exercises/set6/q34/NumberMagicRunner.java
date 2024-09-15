package com.in28minutes.coding.exercises.set6.q34;

public class NumberMagicRunner {

	public static void main(String[] args) {
		NumberMagic numberMagic = new NumberMagic();

		int number = 3, limit = 20;
		System.out.println("Multiples of " + number + " within the limit of " + limit + " are: "
				+ numberMagic.determineMultiples(number, limit));

		int number2 = 5, limit2 = 1;
		System.out.println("Multiples of " + number2 + " within the limit of " + limit2 + " are: "
				+ numberMagic.determineMultiples(number2, limit2));
	}

}
