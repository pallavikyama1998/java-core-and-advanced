package com.in28minutes.coding.exercises.set3.q11;

public class TriangleValidatorRunner {

	public static void main(String[] args) {
		TriangleValidator triangleValidator = new TriangleValidator();
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(3, 3, 3));
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(0, 4, 5));
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(-1, 4, 5));
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(3, 4, 5));
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(5, 12, 13));
		System.out.println("Is this a right-angled triangle? - " + triangleValidator.isRightAngled(9, 12, 15));
	}

}
