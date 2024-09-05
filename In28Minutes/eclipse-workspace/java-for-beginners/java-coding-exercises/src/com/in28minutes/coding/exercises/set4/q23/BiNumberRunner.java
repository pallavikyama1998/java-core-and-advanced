package com.in28minutes.coding.exercises.set4.q23;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber binum = new BiNumber(48, 18);
		System.out.println(binum.calculateGCD()); // Output: 6

		binum = new BiNumber(0, 5);
		System.out.println(binum.calculateGCD()); // Output: 0

		binum = new BiNumber(-4, 2);
		System.out.println(binum.calculateGCD()); // Output: 1

		binum = new BiNumber(1, 1);
		System.out.println(binum.calculateGCD()); // Output: 1

		binum = new BiNumber(-1, -4);
		System.out.println(binum.calculateGCD()); // Output: 1

		binum = new BiNumber(0, 0);
		System.out.println(binum.calculateGCD()); // Output: 0

		binum = new BiNumber(5, 5);
		System.out.println(binum.calculateGCD()); // Output: 5

		binum = new BiNumber(-1, -1);
		System.out.println(binum.calculateGCD()); // Output: 1
	}

}
