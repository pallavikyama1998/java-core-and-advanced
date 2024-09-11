package com.in28minutes.coding.exercises.set5.q26;

public class StringMagic {

	/**
	 * This method finds the rightmost digit in a given string.
	 *
	 * @param str The string to find the rightmost digit in.
	 * @return The rightmost digit in the string. If no digit is found, return -1.
	 */
	public int getRightmostDigit(String str) {
		for (int i = str.length() - 1; i >= 0; i--)
			if (Character.isDigit(str.charAt(i)))
				return Character.getNumericValue(str.charAt(i));
		return -1;
	}
}