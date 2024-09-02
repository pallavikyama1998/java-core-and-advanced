package com.in28minutes.coding.exercises.set3.q15;

public class WeatherAdviser {

	public String provideWeatherAdvisory(int temperature) {
		// Provide a weather advisory message based on the temperature.
		if (temperature < 0)
			return "It's freezing! Wear a heavy coat.";
		if (temperature <= 10)
			return "It's cold! Bundle up.";
		if (temperature <= 20)
			return "It's cool! A light jacket will do.";
		return "It's warm! Enjoy the day.";
	}
}
