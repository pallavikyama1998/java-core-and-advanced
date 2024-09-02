package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		return !isVowel() && isAlphabet();
	}

	public boolean isDigit() {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
