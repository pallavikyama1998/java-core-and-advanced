package com.in28minutes.coding.exercises.set3.q11;

public class TriangleValidator {
	public boolean isRightAngled(int side1, int side2, int side3) {
		if (side1 > 0 && side2 > 0 && side3 > 0 && (pythagoreanValidation(side1, side2, side3)
				|| pythagoreanValidation(side2, side3, side1) || pythagoreanValidation(side3, side1, side2)))
			return true;

		return false;
	}

	public static boolean pythagoreanValidation(int side1, int side2, int side3) {
		return side1 * side1 == ((side2 * side2) + (side3 * side3));
	}
}
