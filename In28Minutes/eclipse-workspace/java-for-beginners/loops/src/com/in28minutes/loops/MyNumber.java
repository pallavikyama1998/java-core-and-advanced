package com.in28minutes.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		for (int i = 2; number > 1 && i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= number; i++)
			sum += i;
		return sum;
	}

	public int sumOfDivisors() {
		// excluding 1 and itself for sum of divisors of a number
		int sumOfDivisors = 0;
		for (int i = 2; number > 1 && i < number; i++)
			if (number % i == 0)
				sumOfDivisors += i;
		return sumOfDivisors;
	}

	public void printANumberTriangle() {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}

	}

}
