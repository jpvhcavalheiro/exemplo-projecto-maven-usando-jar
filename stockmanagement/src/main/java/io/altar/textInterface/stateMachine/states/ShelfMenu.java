package io.altar.textInterface.stateMachine.states;

public class ShelfMenu implements State {
	@Override
	public int execute() {
		System.out.println("Shelf menu");
		System.out.println("");
		System.out.println("1) Create a shelf");
		System.out.println("2) Consult the details of a shelf");
		System.out.println("3) Edit an existing shelf");
		System.out.println("4) Remove a shelf");
		System.out.println("5) Return to the previous menu");
		int [] validValues={1,2,3,4,5};
		return scannerUtils.getValidIntFromScanner(validValues);
	}

}
