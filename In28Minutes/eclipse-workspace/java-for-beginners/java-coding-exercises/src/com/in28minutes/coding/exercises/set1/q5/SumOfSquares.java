package com.in28minutes.coding.exercises.set1.q5;

public class SumOfSquares {
	public long calculateSumOfSquares(int n) {

		if (n < 0)
			return -1;
		long sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i * i;
		return sum;
	}
}
