package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(70);
		MotorBike honda = new MotorBike(60);
		MotorBike pulsar = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(pulsar.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(-100); // invalid speed, prevented by encapsulation
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		System.out.println(honda.getSpeed());

		ducati.setSpeed(20);
		System.out.println(ducati.getSpeed());

		honda.setSpeed(0);
		System.out.println(honda.getSpeed());

		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());

		honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());

		ducati.decreaseSpeed(150);
		System.out.println(ducati.getSpeed());

		honda.decreaseSpeed(150);
		System.out.println(honda.getSpeed());

	}

}
