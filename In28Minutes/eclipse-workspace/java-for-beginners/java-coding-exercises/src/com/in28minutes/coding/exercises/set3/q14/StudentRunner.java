package com.in28minutes.coding.exercises.set3.q14;

public class StudentRunner {

	public static void main(String[] args) {
		Student student1 = new Student(85);
		System.out.println(student1.assignGrade()); // Should print 'B'
		Student student2 = new Student(101);
		System.out.println(student2.assignGrade()); // Should print 'X'
	}

}
