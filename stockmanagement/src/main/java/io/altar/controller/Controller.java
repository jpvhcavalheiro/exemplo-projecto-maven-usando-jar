package io.altar.controller;

import java.util.ArrayList;
import java.util.Iterator;

import io.altar.models.*;
import io.altar.repository.*;

public class Controller {
	public static ProductRepository productRepository1 = ProductRepository.getInstance();
	public static ShelfRepository shelfRepository1 = ShelfRepository.getInstance();

	public static void initializeShelfRepository() {
		final ShelfRepository emptyShelfRepository1 = ShelfRepository.getInstance();
	}

	public static void initializeProductRepository() {
		final ProductRepository emptyproductRepository1 = ProductRepository.getInstance();
	}

	public static void addNewProductToProductRepository(Product productToAdd) {
		productRepository1.createEntity(productToAdd);
		Iterator<Product> it = productRepository1.showAll();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void updateShelfRepositoryAccordingToShelvesList(ArrayList<Long> shelvesList) {
		for (long item : shelvesList) {

		}
	}
	
	public static boolean isThereThisShelf(long shelfIdToTest) {
		if(shelfRepository1.fetchEntityById(shelfIdToTest) == null) {
			return false;
		} else {
			return true;
		}
	}

}
