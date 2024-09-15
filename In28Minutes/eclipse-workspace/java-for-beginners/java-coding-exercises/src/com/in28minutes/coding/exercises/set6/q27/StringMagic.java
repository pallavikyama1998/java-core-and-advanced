package com.in28minutes.coding.exercises.set6.q27;

public class StringMagic {

	/**
	 * This method finds the longest word in a given sentence.
	 *
	 * @param sentence The sentence to find the longest word in.
	 * @return The longest word in the sentence. If sentence is empty, return an
	 *         empty string.
	 */
	public String findLongestWord(String sentence) {
		if (sentence.isEmpty() || sentence == null)
			return "";

		String[] words = sentence.split(" ");

		String longestWord = "";
		for (String word : words)
			if (longestWord.length() < word.length())
				longestWord = word;
		return longestWord;
	}
}
