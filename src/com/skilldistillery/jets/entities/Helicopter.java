package com.skilldistillery.jets.entities;

public class Helicopter extends Jet implements Hoverable {

	
	public Helicopter() {
		super();
	}

	public Helicopter(String model, int speed, long range, double price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Helicopter: " + model + " Average Cruising Speed: " + speed + " MAX Range at Avg Cruising Speed: " + range + " Purchase Price: " + price);
		return "";
	}

	@Override
	public void Hover() {
		System.out.println(model + ": Use main rotor to deflect air downward, placing vehicle in to a hover.");
	}
	
	@Override
	public void fly() {
		System.out.println("The main rotor spins directing air downward to generate lift, allowing the helicopter to takeoff");
		System.out.println(model + " " + speed + " " + range + " " +  price);
		System.out.println("We can fly for " + range / speed + " hours before needing to refuel\n");
	}


}
