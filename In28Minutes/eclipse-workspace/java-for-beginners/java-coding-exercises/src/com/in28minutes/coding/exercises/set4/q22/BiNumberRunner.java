package com.in28minutes.coding.exercises.set4.q22;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber binum = new BiNumber(10, -1);
		System.out.println(binum.calculateLCM()); // Output: -1
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(10, 10);
		System.out.println(binum.calculateLCM()); // Output: 10
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(15, 20);
		System.out.println(binum.calculateLCM()); // Output: 60
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(-1, -1);
		System.out.println(binum.calculateLCM()); // Output: -1
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(10, 0);
		System.out.println(binum.calculateLCM()); // Output: 0
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(-15, 20);
		System.out.println(binum.calculateLCM()); // Output: -1
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(0, 20);
		System.out.println(binum.calculateLCM()); // Output: 0
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(0, 0);
		System.out.println(binum.calculateLCM()); // Output: 0
		System.out.println(binum.calculateLCMUsingForLoop());

		binum = new BiNumber(9, 6);
		System.out.println(binum.calculateLCM()); // Output: 18
		System.out.println(binum.calculateLCMUsingForLoop());
	}

}
