package io.altar.textInterface.stateMachine.states;

import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;

public interface State {
	public static final ScannerUtils scannerUtils = new ScannerUtils();

	public int execute();
}
