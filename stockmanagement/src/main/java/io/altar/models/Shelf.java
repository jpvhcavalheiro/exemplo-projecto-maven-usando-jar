package io.altar.models;

public class Shelf extends Entity {
	private String capacity;
	private long productIdInShelf;
	private double rentPrice;
	public Shelf(String capacity, long productIdInShelf, double rentPrice) {
		super();
		this.capacity = capacity;
		this.productIdInShelf = productIdInShelf;
		this.rentPrice = rentPrice;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public long getProductIdInShelf() {
		return productIdInShelf;
	}
	public void setProductIdInShelf(long newProductIdInShelf) {
		this.productIdInShelf = newProductIdInShelf;
	}
	public double getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String shelfToString() {
		return "Shelf"+getId()+" [capacity=" + capacity + ", productIdInShelf=" + productIdInShelf + ", rentPrice=" + rentPrice + "]";
	}
}
