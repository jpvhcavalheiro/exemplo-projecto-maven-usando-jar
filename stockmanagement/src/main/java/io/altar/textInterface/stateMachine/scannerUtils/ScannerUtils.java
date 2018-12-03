package io.altar.textInterface.stateMachine.scannerUtils;

import java.util.Scanner;
import io.altar.controller.Controller;

public class ScannerUtils {
	static Scanner scanner = new Scanner(System.in);

	public static int isAnIntBetweenMinimumAndMaximum(String textToPresent, int minimum, int maximum) {
		int provisoryReturn;
		System.out.println(textToPresent);
		if (scanner.hasNextInt()) {
			provisoryReturn = scanner.nextInt();
			scanner.nextLine();
			if (provisoryReturn >= minimum && provisoryReturn <= maximum) {
				return provisoryReturn;
			}
		}
		scanner.nextLine();
		return -1;
	}

	public static double isADoubleBetweenMinimumAndMaximum(String textToPresent, double minimum, double maximum) {

		double provisoryReturn;
		System.out.println(textToPresent);

		if (scanner.hasNextDouble()) {
			provisoryReturn = scanner.nextDouble();
			scanner.nextLine();
			if (provisoryReturn >= minimum && provisoryReturn <= maximum) {
				return provisoryReturn;
			}
		}
		scanner.nextLine();
		return -1;
	}

	public static int getValidIntFromScanner(int[] acceptedValues) {
		int input = -1;
		boolean isAValidInput = false;

		if (scanner.hasNextInt()) {
			input = scanner.nextInt();
			scanner.nextLine();
			for (int i : acceptedValues) {
				if (input == i) {
					isAValidInput = true;
				}
			}
		} else {
			scanner.nextLine();
		}
		if (isAValidInput == false) {
			System.out.println("Error. Invalid input.");
			return 0;
		} else {
			return input;
		}
	}

	public static String addNewString() {
		String inputString = scanner.nextLine();
		return inputString;
	}

	public static long isAValidShelfNumber() {
		long shelfNumber;
		if(scanner.hasNextInt()) {
			shelfNumber=scanner.nextInt();
			scanner.nextLine();
			if(Controller.isThereThisShelf(shelfNumber)) {
				return shelfNumber;
			}
		}
		return -1;
	}
}
