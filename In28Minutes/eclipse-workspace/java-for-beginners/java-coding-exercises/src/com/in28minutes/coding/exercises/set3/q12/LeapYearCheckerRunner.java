package com.in28minutes.coding.exercises.set3.q12;

public class LeapYearCheckerRunner {

	public static void main(String[] args) {
		LeapYearChecker leapYearChecker = new LeapYearChecker();
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(1900));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(2000));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(2001));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(2004));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(2400));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(0));
		System.out.println("Is this a leap year? - " + leapYearChecker.isLeapYear(-1));
	}

}
