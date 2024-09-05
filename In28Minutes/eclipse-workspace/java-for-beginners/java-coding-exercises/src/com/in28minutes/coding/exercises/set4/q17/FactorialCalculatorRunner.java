package com.in28minutes.coding.exercises.set4.q17;

public class FactorialCalculatorRunner {

	public static void main(String[] args) {
		FactorialCalculator calculator = new FactorialCalculator();

		System.out.println(calculator.calculateFactorial(5)); // Output: 120
		System.out.println(calculator.calculateFactorial(4)); // Output: 24
		System.out.println(calculator.calculateFactorial(3)); // Output: 6
		System.out.println(calculator.calculateFactorial(2)); // Output: 2
		System.out.println(calculator.calculateFactorial(1)); // Output: 1
		System.out.println(calculator.calculateFactorial(0)); // Output: 1
		System.out.println(calculator.calculateFactorial(-5)); // Output: -1
	}

}
