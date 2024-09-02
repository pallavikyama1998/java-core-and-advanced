package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1200);
		Book cleanCode = new Book(1500);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.read("'Art of Computer Programming'");
		effectiveJava.read("'Effective Java'");
		cleanCode.read("'Clean Code'");

		artOfComputerProgramming.setNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		effectiveJava.setNoOfCopies(50);
		System.out.println(effectiveJava.getNoOfCopies());

		cleanCode.setNoOfCopies(45);
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.increaseNoOfCopies(250);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		effectiveJava.increaseNoOfCopies(250);
		System.out.println(effectiveJava.getNoOfCopies());

		cleanCode.increaseNoOfCopies(250);
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.decreaseNoOfCopies(500);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		effectiveJava.decreaseNoOfCopies(500);
		System.out.println(effectiveJava.getNoOfCopies());

		cleanCode.decreaseNoOfCopies(500);
		System.out.println(cleanCode.getNoOfCopies());

	}

}
