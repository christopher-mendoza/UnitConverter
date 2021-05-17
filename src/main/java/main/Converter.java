package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String args[]) {
		int menuSelectionInt = 0;
		String menuSelectionStr = "";
		Scanner scan = new Scanner(System.in);
		
		while(menuSelectionInt != 4) {
			System.out.println("Please select an option:\n"
							 + "1. Cups to Teaspoons\n"
							 + "2. Miles to Kilometers\n"
							 + "3. US Gallons to Imperial Gallons\n"
							 + "4. Quit");
			menuSelectionStr = scan.nextLine();
			
			// Check if the input is a number
			try {
				menuSelectionInt = Integer.parseInt(menuSelectionStr);
			} catch(NumberFormatException e) {
				System.out.println("That was not valid input.");
			}
			
			
			switch(menuSelectionInt) {
				case 1: { // Cups to Teaspoons
					System.out.println("Cups to teaspoo");
					break;
				}
				case 2: { // Miles to Kilometers
					System.out.println("Miles to Kilometers");
					break;
				}
				case 3: { // US Gallons to Imperial Gallons
					System.out.println("US Gallons to Imperial Gallons");
					break;
				}
				case 4: { // Quit
					System.out.println("You have quit the Unit Converter.");
					break;
				}
				default: { // Bad Input
					System.out.println("You must choose a number between 1-4.");
					break;
				}
					
			}
		}
		
		scan.close();
	}

}
