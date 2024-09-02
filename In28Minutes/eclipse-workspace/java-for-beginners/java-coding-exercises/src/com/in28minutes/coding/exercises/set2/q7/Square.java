package com.in28minutes.coding.exercises.set2.q7;

public class Square {

	private int side;

	public Square(int side) {
		// Initialize side with the passed value
		this.side = side;
	}

	public int calculateArea() {
		// Calculate and return the area of the square
		if (side <= 0)
			return -1;
		return side * side;
	}

	public int calculatePerimeter() {
		// Calculate and return the perimeter of the square
		if (side <= 0)
			return -1;
		return 4 * side;
	}

}
