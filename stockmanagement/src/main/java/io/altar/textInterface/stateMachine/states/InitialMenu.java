package io.altar.textInterface.stateMachine.states;
import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;

public class InitialMenu implements State {
	@Override
	public int execute() {
		System.out.println("1)Show product menu");
		System.out.println("2)Show shelf menu");
		System.out.println("3)Quit");
		int [] validValues = {1,2,3};
		return ScannerUtils.getValidIntFromScanner(validValues);
	}
}
