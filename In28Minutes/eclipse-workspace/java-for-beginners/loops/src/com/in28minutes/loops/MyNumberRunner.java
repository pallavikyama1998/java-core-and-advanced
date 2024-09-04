package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime: " + isPrime);

		int sum = number.sumUpToN();
		System.out.println("Sum up to number: " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of divisors: " + sumOfDivisors); // excluding 1 and itself

		number.printANumberTriangle();
	}

}
