package com.in28minutes.coding.exercises.set6.q29;

public class ArrayMagicRunner {

	public static void main(String[] args) {
		ArrayMagic arrayMagic = new ArrayMagic();

		int[] array = { 5, 7, 9, 2, 4, 9 };
		System.out.println("Second largest element in the array is: " + arrayMagic.findSecondLargestElement(array));
		// Output: 7

		int[] array2 = { 1, 1, 1, 1 };
		System.out.println("Second largest element in the array is: " + arrayMagic.findSecondLargestElement(array2));
		// Output: -1

		int[] array3 = { 7 };
		System.out.println("Second largest element in the array is: " + arrayMagic.findSecondLargestElement(array3));
		// Output: -1
	}

}
