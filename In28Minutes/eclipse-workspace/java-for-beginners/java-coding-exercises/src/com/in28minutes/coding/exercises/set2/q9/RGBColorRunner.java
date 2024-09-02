package com.in28minutes.coding.exercises.set2.q9;

public class RGBColorRunner {
	public static void main(String[] args) {
		RGBColor color1 = new RGBColor(255, 0, 0);
		System.out.println(color1.getRed()); // Prints: 255
		System.out.println(color1.getGreen()); // Prints: 0
		System.out.println(color1.getBlue()); // Prints: 0
		color1.invert();
		System.out.println(color1.getRed()); // Prints: 0
		System.out.println(color1.getGreen()); // Prints: 255
		System.out.println(color1.getBlue()); // Prints: 255

		RGBColor color2 = new RGBColor(0, 255, 0);
		color2.invert();
		System.out.println(color2.getGreen()); // Prints: 0

		RGBColor color3 = new RGBColor(128, 128, 128);
		color3.invert();
		System.out.println(color3.getRed()); // Prints: 127
		System.out.println(color3.getGreen()); // Prints: 127
		System.out.println(color3.getBlue()); // Prints: 127
	}
}
