package com.in28minutes.coding.exercises.set5.q24;

public class StringMagicRunner {

	public static void main(String[] args) {
		StringMagic stringMagic = new StringMagic();
		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
		System.out.println(uppercaseLetters); // This will print 5
	}

}