package com.in28minutes.coding.exercises.set6.q28;

public class ArrayMagicRunner {

	public static void main(String[] args) {
		ArrayMagic arrayMagic = new ArrayMagic();

		int[] array = { 1, 2, 3, 4, 5 };
		int number = 3;
		System.out.println("Does the array have any element greater than the number " + number + "? "
				+ arrayMagic.doesHaveElementGreaterThan(array, number));

		int[] array2 = { 1, 2, 3 };
		int number2 = 4;
		System.out.println("Does the array have any element greater than the number " + number2 + "? "
				+ arrayMagic.doesHaveElementGreaterThan(array2, number2));
	}

}
