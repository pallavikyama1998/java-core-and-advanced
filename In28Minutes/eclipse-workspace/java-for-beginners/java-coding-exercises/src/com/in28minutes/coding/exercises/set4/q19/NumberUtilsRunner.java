package com.in28minutes.coding.exercises.set4.q19;

public class NumberUtilsRunner {

	public static void main(String[] args) {
		NumberUtils utils = new NumberUtils();

		System.out.println(utils.getNumberOfDigits(12345)); // Output: 5
		System.out.println(utils.getNumberOfDigits(90)); // Output: 2
		System.out.println(utils.getNumberOfDigits(9)); // Output: 1
		System.out.println(utils.getNumberOfDigits(0)); // Output: 1
		System.out.println(utils.getNumberOfDigits(-67)); // Output: -1
	}

}