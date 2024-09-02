package com.in28minutes.coding.exercises.set3.q16;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar();

		System.out.println(myChar.isVowel('A')); // Output: true
		System.out.println(myChar.isVowel('b')); // Output: false
		System.out.println(myChar.isVowel('E')); // Output: true
		System.out.println(myChar.isVowel('f')); // Output: false

		System.out.println(myChar.isVowel('A'));
		System.out.println(myChar.isVowel('E'));
		System.out.println(myChar.isVowel('I'));
		System.out.println(myChar.isVowel('O'));
		System.out.println(myChar.isVowel('U'));
		System.out.println(myChar.isVowel('@'));
		System.out.println(myChar.isVowel('4'));
		System.out.println(myChar.isVowel('Z'));
		System.out.println(myChar.isVowel('a'));
		System.out.println(myChar.isVowel('e'));
		System.out.println(myChar.isVowel('i'));
		System.out.println(myChar.isVowel('o'));
		System.out.println(myChar.isVowel('u'));
	}

}
