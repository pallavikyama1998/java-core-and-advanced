package com.in28minutes.coding.exercises.set6.q31;

public class ArrayMagicRunner {

	public static void main(String[] args) {
		ArrayMagic arrayMagic = new ArrayMagic();

		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Is the array sorted? " + arrayMagic.isSorted(array));

		int[] array1 = { 5, 4, 3, 2, 1 };
		System.out.println("Is the array sorted? " + arrayMagic.isSorted(array1));
	}

}
