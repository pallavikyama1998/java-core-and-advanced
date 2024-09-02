package com.in28minutes.coding.exercises.set3.q12;

public class LeapYearChecker {
	public boolean isLeapYear(int year) {
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) || year < 1)
			return false;
		return true;
	}
}
