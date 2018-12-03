package io.altar.textInterface.stateMachine;

import io.altar.textInterface.stateMachine.states.*;
import io.altar.controller.Controller;
import io.altar.repository.ProductRepository;
//import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;

public class FSM {

	private State[] states = { new InitialMenu(), // 0
			new ProductMenu(), // 1
			new ShelfMenu(), // 2
			new CreateProduct(), // 3
			new CreateShelf(), // 4
			new ConsultProduct(), // 5
			new ConsultShelf(), // 6
			new EditProduct(), // 7
			new EditShelf(), // 8
			new DeleteProduct(), // 9
			new DeleteShelf() }; // 10

	private int transitionsMatrix[][] = { {0, 1, 2, 3 }, // state 0 (initial menu)
			{ 1, 3, 5, 7, 9 }, // state 1 (product menu)
			{ 2, 4, 6, 8, 10 }, // state 2 (shelf menu)
			{ 1 }, // state 3 (create product)
			{ 2 }, // state 4 (create shelf)
			{ 1 }, // state 5 (consult product)
			{ 2 }, // state 6 (consult shelf)
			{ 1 }, // state 7 (edit product)
			{ 2 }, // state 8 (edit shelf)
			{ 1 }, // state 9 (delete product)
			{ 2 },// state 10 (delete shelf)

	};
	private int currentState = 0;

	public static void main(String[] args) {
		FSM fsm = new FSM();
		int opcao = 0;
		// ShelfRepository shelfRepository1=Controller.initializeShelfRepository();
		// productRepository = Controller.initializeProductRepository();

		while (true) {
			opcao = fsm.states[fsm.currentState].execute();

			if (fsm.currentState == 0 && opcao == 3) {
				break;
			}
			fsm.currentState = fsm.transitionsMatrix[fsm.currentState][opcao];
		}
	}
}
