package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String args[]) {
		int menuSelectionInt = 0;
		String menuSelectionStr = "";
		Scanner menuScan = new Scanner(System.in);
		float unitSelectionFloat = 0;
		String unitSelectionStr = "";
		Scanner unitScan = new Scanner(System.in);
		
		boolean checker = false;
		
		while(menuSelectionInt != 4) {
			System.out.println("\nPlease select an option:\n"
							 + "1. Cups to Teaspoons\n"
							 + "2. Miles to Kilometers\n"
							 + "3. US Gallons to Imperial Gallons\n"
							 + "4. Quit");
			menuSelectionStr = menuScan.nextLine();
			
			// Check if the input is a number
			try {
				menuSelectionInt = Integer.parseInt(menuSelectionStr);
			} catch(NumberFormatException e) {
				System.out.println("That was not valid input.");
			}
			
			
			switch(menuSelectionInt) {
				case 1: { // Cups to Teaspoons
					while(checker == false) {
						
						System.out.println("Please Enter Cup Amount: ");
						unitSelectionStr = unitScan.nextLine();
						try {
							unitSelectionFloat = Float.parseFloat(unitSelectionStr);
							checker = true;
							System.out.println("Teaspoon amount: " + (unitSelectionFloat * 48));
						} catch(NumberFormatException e) {
							System.out.println("That was not valid input.");
						}
					}
					checker = false;
					menuSelectionInt = 0;
					break;
				}
				case 2: { // Miles to Kilometers
						while(checker == false) {
						
						System.out.println("Please Enter Mile Amount: ");
						unitSelectionStr = unitScan.nextLine();
						try {
							unitSelectionFloat = Float.parseFloat(unitSelectionStr);
							checker = true;
							System.out.println("Kilometer amount: " + (unitSelectionFloat * 1.609344));
						} catch(NumberFormatException e) {
							System.out.println("That was not valid input.");
						}
					}
					checker = false;
					menuSelectionInt = 0;
					break;
				}
				case 3: { // US Gallons to Imperial Gallons
						while(checker == false) {
						
						System.out.println("Please Enter US Gallon Amount: ");
						unitSelectionStr = unitScan.nextLine();
						try {
							unitSelectionFloat = Float.parseFloat(unitSelectionStr);
							checker = true;
							System.out.println("Imperial Gallon amount: " + (unitSelectionFloat * 0.832673));
						} catch(NumberFormatException e) {
							System.out.println("That was not valid input.");
						}
					}
					checker = false;
					menuSelectionInt = 0;
					break;
				}
				case 4: { // Quit
					System.out.println("You have quit the Unit Converter.");
					break;
				}
				default: { // Bad Input
					System.out.println("You must choose a number between 1-4.");
					menuSelectionInt = 0;
					break;
				}
					
			}
		}
		
		menuScan.close();
		unitScan.close();
	}

}
