package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("John", new int[] { 97, 98, 100 });

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks: " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks: " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks: " + minimumMark);

		BigDecimal averageMark = student.getAverageMarks();
		System.out.println("Average of marks: " + averageMark);

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);

		Student student2 = new Student("Eve", new int[] { 97, 99, 100, 90 });

		int number2 = student2.getNumberOfMarks();
		System.out.println("\nNumber of marks: " + number2);

		int sum2 = student2.getTotalSumOfMarks();
		System.out.println("Sum of marks: " + sum2);

		int maximumMark2 = student2.getMaximumMark();
		System.out.println("Maximum of marks: " + maximumMark2);

		int minimumMark2 = student2.getMinimumMark();
		System.out.println("Minimum of marks: " + minimumMark2);

		BigDecimal averageMark2 = student2.getAverageMarks();
		System.out.println("Average of marks: " + averageMark2);

		System.out.println(student2);
	}

}
