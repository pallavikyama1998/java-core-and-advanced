package com.in28minutes.coding.exercises.set6.q32;

import java.util.Arrays;

public class ArrayMagicRunner {

	public static void main(String[] args) {

		ArrayMagic arrayMagic = new ArrayMagic();

		int[] array = { 1, 2, 3, 4 };
		System.out.println("Reversed array is: " + Arrays.toString(arrayMagic.reverseArray(array)));

		int[] array2 = { 5, -10, 15, -20 };
		System.out.println("Reversed array is: " + Arrays.toString(arrayMagic.reverseArray(array2)));

		int[] array3 = { 100, 200, 300, 400, 500 };
		System.out.println("Reversed array is: " + Arrays.toString(arrayMagic.reverseArray(array3)));

	}

}
