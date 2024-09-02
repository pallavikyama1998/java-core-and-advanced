package com.in28minutes.oops;

public class Book {

	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	void increaseNoOfCopies(int howMany) {
		setNoOfCopies(noOfCopies + howMany);
	}

	void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(noOfCopies - howMany);
	}

	void read(String bookName) {
		System.out.println("Reading " + bookName);
	}

}
