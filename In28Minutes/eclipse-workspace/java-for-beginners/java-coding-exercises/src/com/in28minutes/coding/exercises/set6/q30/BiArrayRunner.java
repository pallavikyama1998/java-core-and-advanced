package com.in28minutes.coding.exercises.set6.q30;

public class BiArrayRunner {

	public static void main(String[] args) {

		int[] array1 = { 1, 2 };
		int[] array2 = { 4, -2, 1 };
		BiArray biArray = new BiArray(array1, array2);
		System.out.println("Are the sum of elements of both arrays equal? " + biArray.areSumsEqual());

		int[] array3 = { 5, 10, 15 };
		int[] array4 = { 1, 9, 20 };
		biArray = new BiArray(array3, array4);
		System.out.println("Are the sum of elements of both arrays equal? " + biArray.areSumsEqual());

		int[] array5 = { -1, -1, -1 };
		int[] array6 = { -2, 1 };
		biArray = new BiArray(array5, array6);
		System.out.println("Are the sum of elements of both arrays equal? " + biArray.areSumsEqual());

	}

}
