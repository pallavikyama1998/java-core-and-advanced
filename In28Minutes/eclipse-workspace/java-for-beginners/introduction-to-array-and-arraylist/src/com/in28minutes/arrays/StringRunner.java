package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String dayWithMostCharacters = "";
		for (String day : daysOfWeek)
			if (day.length() > dayWithMostCharacters.length())
				dayWithMostCharacters = day;
		System.out.println("Day with most nuber of characters is: " + dayWithMostCharacters);

		System.out.println("\nDays of the week in reverse order: ");
		for (int i = daysOfWeek.length - 1; i >= 0; i--)
			System.out.println(daysOfWeek[i]);
	}

}
