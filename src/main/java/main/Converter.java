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
			menuSelectionInt = Integer.parseInt(menuSelectionStr);
			
			
		}
		
		scan.close();
	}

}
