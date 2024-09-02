package com.in28minutes.coding.exercises.set3.q10;

public class TriangleValidatorRunner {

	public static void main(String[] args) {
		TriangleValidator triangleValidator=new TriangleValidator();
		System.out.println("Is this a triangle? - " + triangleValidator.isValidTriangle(60, 60, 60));
		System.out.println("Is this a triangle? - " + triangleValidator.isValidTriangle(90, 90, 90));
		System.out.println("Is this a triangle? - " + triangleValidator.isValidTriangle(-30, 90, 120));
		System.out.println("Is this a triangle? - " + triangleValidator.isValidTriangle(0, 100, 80));
		System.out.println("Is this a triangle? - " + triangleValidator.isValidTriangle(-60, -60, -60));
	}

}
