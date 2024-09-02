package com.in28minutes.coding.exercises.set1.q3;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		if (hours >= 0)
			return hours * 60;
		return -1;
	}

	public static int convertDaysToMinutes(int days) {
		return convertHoursToMinutes(24 * days);
	}

	public static void main(String[] args) {
		System.out.println(convertHoursToMinutes(24));
		System.out.println(convertDaysToMinutes(30));
	}
}