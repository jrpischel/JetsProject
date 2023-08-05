package com.skilldistillery.jets.entities;

public class MilitaryJet extends Jet implements Hoverable {

	
	public MilitaryJet() {
		super();
	}

	public MilitaryJet(String model, int speed, long range, double price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Military Jet: " + model + " Average Cruising Speed: " + speed + " MAX Range at Avg Cruising Speed: " + range + " Purchase Price: " + price);
		return "";
	}

	@Override
	public void Hover() {
		System.out.println(model + ": Engage VTOL engine to hover");
	}

	@Override
	public void fly() {
		System.out.println("Engaging the VTOL engine applies downward thrust allowing for the takeoff at lower speeds on shorter runways");
		System.out.println(model + " " + speed + " " + range + " " +  price);
		System.out.println("We can fly for " + range / speed + " hours before needing to refuel\n");
	}


}

