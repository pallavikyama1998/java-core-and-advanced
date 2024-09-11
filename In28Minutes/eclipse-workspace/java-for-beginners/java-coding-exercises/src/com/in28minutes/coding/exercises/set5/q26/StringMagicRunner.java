package com.in28minutes.coding.exercises.set5.q26;

public class StringMagicRunner {

	public static void main(String[] args) {

		StringMagic stringMagic = new StringMagic();
		System.out.println(stringMagic.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges")); // Output: 3
		System.out.println(stringMagic.getRightmostDigit("There are no numbers in this string")); // Output: -1
		System.out.println(stringMagic.getRightmostDigit("")); // Output: -1
	}

}
