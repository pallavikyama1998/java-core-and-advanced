package com.in28minutes.coding.exercises.set4.q18;

public class NumberUtils {

	public int getLastDigit(int number) {
		if (number < 0)
			return -1;

		return number % 10;
	}
}