package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks)
			this.marks.add(mark);
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks)
			sum += mark;
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
//		int max = Integer.MIN_VALUE;
//		for (int mark : marks)
//			max = Math.max(max, mark);
//		return max;
	}

	public int getMinimumMark() {
		return Collections.min(marks);
//		int min = Integer.MAX_VALUE;
//		for (int mark : marks)
//			min = Math.min(min, mark);
//		return min;
	}

	public BigDecimal getAverageMarks() {
		BigDecimal number = new BigDecimal(getNumberOfMarks());
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		return sum.divide(number, 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
