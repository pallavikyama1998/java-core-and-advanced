package com.in28minutes.coding.exercises.set6.q29;

import java.util.Arrays;

public class ArrayMagic {

	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array
	 */

	public int findSecondLargestElement(int[] array) {
		if (array.length < 2)
			return -1;
		Arrays.sort(array);
		int largestElement = array[array.length - 1];
		for (int i = array.length - 2; i >= 0; i--) {
			if (array[i] < largestElement) {
				return array[i];
			}
		}

		return -1;
	}
}
