package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApp {
	Scanner kb = new Scanner(System.in);
	AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApp jets = new JetsApp();

		jets.launch();

	}

	public void launch() {
		airField.buildingFleet();
		int selection = 0;

		System.out.println("Please use the numbers provided to select an option: ");

		do {
			menu();
			selection = kb.nextInt();

			switch (selection) {

			case 1:
				airField.listFleet();
				break;
			case 2:
				airField.singleFly(kb);
				break;
			case 3:
				airField.flyAll();
				break;
			case 4:
				airField.fastestJet();
				break;
			case 5:
				airField.longestRange();
				break;
			case 6:
				airField.warpAll();
				break;
			case 7:
				airField.hoverAll();
				break;
			case 8:
				airField.addJet(kb);
				break;
			case 9:
				airField.removeJet(kb);
				break;
			case 10:
				System.out.println("Good Bye");
				break;
			default:
				System.out.println("Invalid Selection");
			}
		} while (selection != 9);
		
		
		kb.close();
	}
	
	public void menu() {

		System.out.println("***********************************");
		System.out.println("* 1.  List Fleet                  *");
		System.out.println("* 2.  Fly One Jet                 *");
		System.out.println("* 3.  Fly All Jets                *");
		System.out.println("* 4.  View Fastest Jet            *");
		System.out.println("* 5.  View Jet With Longest Range *");
		System.out.println("* 6.  Warp all Spaceships         *");
		System.out.println("* 7.  Hover all Air Craft         *");
		System.out.println("* 8.  Add A Jet To The Fleet      *");
		System.out.println("* 9.  Remove A Jet From The Fleet *");
		System.out.println("* 10. Quit                        *");
		System.out.println("***********************************");

	}
}
