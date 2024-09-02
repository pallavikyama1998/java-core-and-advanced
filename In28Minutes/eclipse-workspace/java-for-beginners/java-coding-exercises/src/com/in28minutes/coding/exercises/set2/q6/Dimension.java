package com.in28minutes.coding.exercises.set2.q6;

public class Dimension {
	private int feet;
	private int inches;

	public Dimension(int inches) {
		// Convert the total inches into feet and inches. One foot is 12 inches.
		// Store the feet and inches in their respective instance variables.

		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
	}

	public int getFeet() {
		return feet;
	}

	public int getInches() {
		return inches;
	}
}
