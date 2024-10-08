package com.in28minutes.coding.exercises.set2.q7;

public class SquareRunner {

	public static void main(String[] args) {
		Square square = new Square(5);
		System.out.println(square.calculateArea()); // prints: 25
		System.out.println(square.calculatePerimeter()); // prints: 20

		Square squareWithZeroSide = new Square(0);
		System.out.println(squareWithZeroSide.calculateArea()); // prints: -1
		System.out.println(squareWithZeroSide.calculatePerimeter()); // prints: -1

		Square squareWithNonPositiveSide = new Square(-5);
		System.out.println(squareWithNonPositiveSide.calculateArea()); // prints: -1
		System.out.println(squareWithNonPositiveSide.calculatePerimeter()); // prints: -1
	}

}
