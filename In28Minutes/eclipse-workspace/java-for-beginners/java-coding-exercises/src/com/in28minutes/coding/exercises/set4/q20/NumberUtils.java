package com.in28minutes.coding.exercises.set4.q20;

public class NumberUtils {

	public int getSumOfDigits(int number) {
		if (number < 0)
			return -1;

		int sumOfDigits = 0;
		do {
			sumOfDigits += number % 10;
			number /= 10;
		} while (number != 0);
		return sumOfDigits;
	}

}