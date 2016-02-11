package org.hashcode.main;

public class Product implements IProduct{
	private int weight;
	private int id;
	public Product(int id, int weight) {
		this.weight = weight;
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

}