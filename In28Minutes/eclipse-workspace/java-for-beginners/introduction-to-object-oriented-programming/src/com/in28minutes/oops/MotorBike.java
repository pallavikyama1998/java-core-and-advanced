package com.in28minutes.oops;

public class MotorBike {

	// state
	private int speed; // member variable - these are specific to the object

	// constructor

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behavior

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(speed - howMuch);
	}

	void start() {
		System.out.println("Bike started");
	}

}
