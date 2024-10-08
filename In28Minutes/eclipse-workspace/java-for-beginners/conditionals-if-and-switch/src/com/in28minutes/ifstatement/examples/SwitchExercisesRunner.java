package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

	public static void main(String[] args) {

		System.out.println("Is it is a weekday? - " + isWeekDay(2));

		System.out.println("The month is - " + determineNameOfMonth(5));

		System.out.println("The day of the week is - " + determineNameOfDay(1));

	}

	private static boolean isWeekDay(int dayNumber) {

		switch (dayNumber) {
		// case 0, 6: return false; --> redundant code
		case 1, 2, 3, 4, 5:
			return true;
		}

		return false;

	}

	private static String determineNameOfMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}

		return "Invalid month-number";

	}

	private static String determineNameOfDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}

		return "Invalid day-number";

	}

}
