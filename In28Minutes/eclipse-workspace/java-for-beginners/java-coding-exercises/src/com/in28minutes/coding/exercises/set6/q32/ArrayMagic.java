package com.in28minutes.coding.exercises.set6.q32;

public class ArrayMagic {

	/**
	 * This method reverses an array.
	 * 
	 * @param array the array to reverse
	 * @return a new array with elements in reverse order
	 */
	public int[] reverseArray(int[] array) {
		if (array.length < 2)
			return array;

		int start = 0, end = array.length - 1;
		int[] reversedArray = new int[array.length];
		do {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];
			start++;
			end--;
		} while (start <= end);
		return reversedArray;
	}
}
