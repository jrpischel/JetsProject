package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, int speed, long range, double price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Passenger Jet: " + model + " Average Cruising Speed: " + speed + " MAX Range at Avg Cruising Speed: " + range + " Purchase Price: " + price);
		return "";
	}

	@Override
	public void fly() {
		System.out.println("Power up engines while reaching safe speed traveling down runway, then pull back on stick to greacefull takeoff.");
		System.out.println(model + " " + speed + " " + range + " " +  price);
		System.out.println("We can fly for " + range / speed + " hours before needing to refuel\n");
	}

}
