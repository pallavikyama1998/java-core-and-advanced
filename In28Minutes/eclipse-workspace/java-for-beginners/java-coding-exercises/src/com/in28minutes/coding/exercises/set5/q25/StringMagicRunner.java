package com.in28minutes.coding.exercises.set5.q25;

public class StringMagicRunner {

	public static void main(String[] args) {
		StringMagic stringMagic = new StringMagic();
		System.out.println(stringMagic.hasConsecutiveDuplicates("Hello")); // true
		System.out.println(stringMagic.hasConsecutiveDuplicates("")); // false
		System.out.println(stringMagic.hasConsecutiveDuplicates("H")); // false
		System.out.println(stringMagic.hasConsecutiveDuplicates("HHH")); // true
	}

}
