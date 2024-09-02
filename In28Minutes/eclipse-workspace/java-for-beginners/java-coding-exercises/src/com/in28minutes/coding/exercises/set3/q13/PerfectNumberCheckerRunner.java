package com.in28minutes.coding.exercises.set3.q13;

public class PerfectNumberCheckerRunner {

	public static void main(String[] args) {
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(27));
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(28));
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(100));
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(0));
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(6));
		System.out.println("Is this a perfect number? - " + perfectNumberChecker.isPerfectNumber(-1));
	}

}
