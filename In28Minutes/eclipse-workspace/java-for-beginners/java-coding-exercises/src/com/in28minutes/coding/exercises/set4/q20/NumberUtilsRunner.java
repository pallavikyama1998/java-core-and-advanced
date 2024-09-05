package com.in28minutes.coding.exercises.set4.q20;

public class NumberUtilsRunner {

	public static void main(String[] args) {
		NumberUtils utils = new NumberUtils();

		System.out.println(utils.getSumOfDigits(123)); // Output: 6
		System.out.println(utils.getSumOfDigits(90)); // Output: 9
		System.out.println(utils.getSumOfDigits(5)); // Output: 5
		System.out.println(utils.getSumOfDigits(0)); // Output: 0
		System.out.println(utils.getSumOfDigits(-67)); // Output: -1
	}

}
