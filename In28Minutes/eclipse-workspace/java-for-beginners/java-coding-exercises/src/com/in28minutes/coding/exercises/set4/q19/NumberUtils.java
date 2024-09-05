package com.in28minutes.coding.exercises.set4.q19;

public class NumberUtils {

	/*
	 * This method calculates and returns the number of digits in a given integer.
	 * If the number is negative, it returns -1. If the number is zero, it returns 1
	 * as zero is considered to have one digit.
	 *
	 * @param number: an integer
	 *
	 * @return number of digits in number, or -1 if number is negative, or 1 if
	 * number is zero.
	 */
	public int getNumberOfDigits(int number) {
		if (number < 0)
			return -1;
		else if (number == 0)
			return 1;

		int noOfDigits = 0;
		do {
			number /= 10;
			noOfDigits++;
		} while (number != 0);
		return noOfDigits;
	}
}