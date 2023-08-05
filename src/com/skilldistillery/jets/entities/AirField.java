package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	List<Jet> fleetOfShips = new ArrayList<>();

	public void buildingFleet() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				Jet ship = null;
				String[] jetInfo = line.split(",");
				String type = jetInfo[0];
				String model = jetInfo[1];
				Integer speed = Integer.parseInt(jetInfo[2]);
				Long range = Long.parseLong(jetInfo[3]);
				Double price = Double.parseDouble(jetInfo[4]);

				if (type.equals("SWSpaceship")) {
					ship = new SWSpaceship(model, speed, range, price);
				}
				if (type.equals("STSpaceship")) {
					ship = new STSpaceship(model, speed, range, price);
				}
				if (type.equals("MilitaryJet")) {
					ship = new MilitaryJet(model, speed, range, price);
				}
				if (type.equals("Helicopter")) {
					ship = new Helicopter(model, speed, range, price);
				}
				if (type.equals("PassengerJet")) {
					ship = new PassengerJet(model, speed, range, price);
				}
				fleetOfShips.add(ship);

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void listFleet() {
		System.out.println(fleetOfShips);
	}

	public void flyAll() {
		for (Jet jet : fleetOfShips) {
			jet.fly();
		}

	}

	public void fastestJet() {
		Jet fastestJet = null;
		int fastestSpeed = 0;
		for (Jet jet : fleetOfShips) {
			if (jet != null) {
				if (fastestSpeed < jet.getSpeed()) {
					fastestSpeed = jet.getSpeed();
					fastestJet = jet;
				}
			}
		}
		System.out.print("The Fastest Vehicle is: ");
		System.out.println(fastestJet);
	}

	public void longestRange() {
		Jet HasLongestRange = null;
		long longestRange = 0;
		for (Jet jet : fleetOfShips) {
			if (jet != null) {
				if (longestRange < jet.getRange()) {
					longestRange = jet.getRange();
					HasLongestRange = jet;
				}
			}
		}
		System.out.println("The Vehicle with the longest range is: ");
		System.out.println(HasLongestRange);
	}

	public void warpAll() {
		for (Jet jet : fleetOfShips) {
			if (jet instanceof Warpable) {
				((Warpable) jet).engageWarp();
			}
		}
	}

	public void hoverAll() {
		for (Jet jet : fleetOfShips) {
			if (jet instanceof Hoverable) {
				((Hoverable) jet).Hover();
			}
		}
	}

	public void addJet(Scanner kb) {
		Jet ship = null;
		int typeChoice = 0;
		String type = null;
		
		System.out.println("****************************************************");
		System.out.println("* What is TYPE of ship you're adding to the fleet? *");
		System.out.println("* 1. Star Wars Space Ship                          *");
		System.out.println("* 2. Star Trek Space Ship                          *");
		System.out.println("* 3. Helicopter                                    *");
		System.out.println("* 4. Military Jet                                  *");
		System.out.println("* 5. Passenger Jet                                 *");
		System.out.println("****************************************************");
		
		typeChoice = kb.nextInt();
		kb.nextLine();
		
		if (typeChoice == 1) {
			type = "SWSpaceship";
		}
		if (typeChoice == 2) {
			type = "STSpaceship";
		}
		if (typeChoice == 3) {
			type = "Helicopter";
		}
		if (typeChoice == 4) {
			type = "MilitaryJet";
		}
		if (typeChoice == 5) {
			type = "PassengerJet";
		}
		
		System.out.println("What MODEL is the ship you're adding to the fleet?");
		String model = kb.nextLine();
		
		System.out.println("What is the average crusing SPEED of the ship you're adding to the fleet?");
		int speed = kb.nextInt();
		kb.nextLine();
		
		System.out.println("What is the DISTANCE the ship travel at its average cruising speed, before needing to be refuled?");
		long range = kb.nextLong();
		kb.nextLine();
		
		System.out.println("How much does the ship COST?");
		double price = kb.nextDouble();
		kb.nextLine();
		
		if (type.equalsIgnoreCase("SWSpaceShip")) {
			ship = new SWSpaceship(model, speed, range, price);
		}
		if (type.equalsIgnoreCase("STSpaceShip")) {
			ship = new STSpaceship(model, speed, range, price);
		}
		if (type.equalsIgnoreCase("Helicopter")) {
			ship = new Helicopter(model, speed, range, price);
		}
		if (type.equalsIgnoreCase("MilitaryJet")) {
			ship = new MilitaryJet(model, speed, range, price);
		}
		if (type.equalsIgnoreCase("PassengerJet")) {
			ship = new PassengerJet(model, speed, range, price);
		}
		
		fleetOfShips.add(ship);
	}

	public void removeJet(Scanner kb) {
		int counter = 1;
		int modelChoice = 0;
		System.out.println("*****************************************************");
		System.out.println("  What is the MODEL of the ship you wish to remove?  ");
		for (Jet jet : fleetOfShips) {
			System.out.println("  " + counter + " " + jet.getModel());
			counter++;
		}
		System.out.println("*****************************************************");
		modelChoice = kb.nextInt();
		kb.nextLine();
		fleetOfShips.remove(modelChoice - 1);
	}

	public void singleFly(Scanner kb) {
		Jet ship = null;
		int counter = 1;
		int modelChoice = 0;
		System.out.println("*****************************************************");
		System.out.println("  What is the MODEL of the ship you wish to FLY?  ");
		for (Jet jet : fleetOfShips) {
			System.out.println("  " + counter + " " + jet.getModel());
			counter++;
		}
		System.out.println("*****************************************************");
		modelChoice = kb.nextInt();
		kb.nextLine();
		ship = fleetOfShips.get(modelChoice - 1);
		ship.fly();
		
	}
}
