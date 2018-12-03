package io.altar.textInterface.stateMachine.states;

import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;

public class ProductMenu implements State {

	@Override
	public int execute(){
		System.out.println("Product Menu");
		System.out.println("");
		
		System.out.println("1) Create a new product");
		System.out.println("2) Consult the details of a product");
		System.out.println("3) Edit an existing product");
		System.out.println("4) Delete a product");
		System.out.println("5) return to the initial menu");
		int [] validValues={1,2,3,4,5};
		return ScannerUtils.getValidIntFromScanner(validValues);
		
	}
}
