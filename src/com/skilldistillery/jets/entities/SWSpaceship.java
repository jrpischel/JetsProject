package com.skilldistillery.jets.entities;

public class SWSpaceship extends Jet implements Warpable {

	public SWSpaceship() {
		super();
	}

	public SWSpaceship(String model, int speed, long range, double price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String toString() {
		System.out.println("Star Wars Spaceship: " + model + " Average Cruising Speed: " + speed + " MAX Range at Avg Cruising Speed: " + range + " Purchase Price: " + price);
		return "";
	}

	@Override
	public void fly() {
		System.out.println("Engage repuslor lifts for takeoff");
		System.out.println(model + " " + speed + " " + range + " " +  price);
		System.out.println("We can fly for " + range / speed + " hours before needing to refuel\n");
	}

	public void engageWarp() {
		System.out.println(model + ": Making the jump to Hyper Space");
	}

}
