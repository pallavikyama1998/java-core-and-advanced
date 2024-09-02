package com.in28minutes.coding.exercises.set3.q15;

public class WeatherAdviserRunner {

	public static void main(String[] args) {
		WeatherAdviser adviser = new WeatherAdviser();

		System.out.println(adviser.provideWeatherAdvisory(-5));
		// Output: "It's freezing! Wear a heavy coat."

		System.out.println(adviser.provideWeatherAdvisory(5));
		// Output: "It's cold! Bundle up."

		System.out.println(adviser.provideWeatherAdvisory(15));
		// Output: "It's cool! A light jacket will do."

		System.out.println(adviser.provideWeatherAdvisory(25));
		// Output: "It's warm! Enjoy the day."

		System.out.println(adviser.provideWeatherAdvisory(10));
		System.out.println(adviser.provideWeatherAdvisory(20));
		System.out.println(adviser.provideWeatherAdvisory(0));
		System.out.println(adviser.provideWeatherAdvisory(30));
		System.out.println(adviser.provideWeatherAdvisory(-10));
		System.out.println(adviser.provideWeatherAdvisory(1));
		System.out.println(adviser.provideWeatherAdvisory(9));
		System.out.println(adviser.provideWeatherAdvisory(11));
		System.out.println(adviser.provideWeatherAdvisory(19));
	}

}
