package com.skilldistillery.jets.entities;

public class STSpaceship extends Jet implements Warpable {

	public STSpaceship() {
		super();
	}

	public STSpaceship(String model, int speed, long range, double price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Star Trek Spaceship: " + model + " Average Cruising Speed: " + speed + " MAX Range at Avg Cruising Speed: " + range + " Purchase Price: " + price);
		return "";
	}

	@Override
	public void fly() {
		System.out.println("Powers up Impulse Engines");
		System.out.println(model + " " + speed + " " + range + " " +  price);
		System.out.println("We can fly for " + range / speed + " hours before needing to refuel\n");
	}

	public void engageWarp() {
		System.out.println(model + ": Engaging Warp Engines");
	}

}

