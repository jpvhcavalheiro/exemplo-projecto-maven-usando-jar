package io.altar.textInterface.stateMachine.states;

import java.util.ArrayList;

import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;
import io.altar.models.*;
import io.altar.controller.Controller;

public class CreateProduct implements State {
	public int execute() {
		double price1 = ScannerUtils.isADoubleBetweenMinimumAndMaximum("Please insert price:", 0.0, 1.7E308);
		int discount1 = ScannerUtils.isAnIntBetweenMinimumAndMaximum("Please insert discount:", 0, 100);
		int iva1 = ScannerUtils.isAnIntBetweenMinimumAndMaximum("Please insert iva:", 0, 100);
		ArrayList<Long> shelveslist1 = new ArrayList<Long>();
		String shouldThisProductBeAddedToANewShelf = "yes";
		long shelfWhereTheProductIsAllocated = -2;
		do {
			System.out.println("Do you want to add this product to a new shelf?");
			shouldThisProductBeAddedToANewShelf = ScannerUtils.addNewString();
			if (shouldThisProductBeAddedToANewShelf.equals("yes")) {
				System.out.println("Where do you want to put this product?");
				shelfWhereTheProductIsAllocated = ScannerUtils.isAValidShelfNumber();
				if (shelfWhereTheProductIsAllocated == -2) {
					break;
				} else {
					shelveslist1.add(shelfWhereTheProductIsAllocated);
				}
			}else {
				break;
			}
		} while (shouldThisProductBeAddedToANewShelf.equals("yes"));
		if (price1 == -1 || discount1 == -1 || iva1 == -1
				|| (!shouldThisProductBeAddedToANewShelf.equals("no")
						&& shouldThisProductBeAddedToANewShelf.equals("yes"))
				|| shelfWhereTheProductIsAllocated == -1) {
			System.out.println("Error! Invalid input");
		} else {
			//Controller.updateShelfRepositoryAccordingToShelvesList(shelveslist1);
			Product product1 = new Product(shelveslist1,discount1,iva1,price1);
			Controller.addNewProductToProductRepository(product1);
		}
		return 0;
	}
}
