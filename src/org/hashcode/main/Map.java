package org.hashcode.main;

import java.util.ArrayList;
import java.util.List;

public class Map implements IMap {

	private int width;
	private int height;
	private int numberOfDrones;
	private int maxTurns;
	private int maxPayload;
	private ArrayList<IProduct> products;
	
	public Map(int width, int height, int numberOfDrones, int maxTurns, int maxPayload) {
		this.width = width;
		this.height = height;
		this.numberOfDrones = numberOfDrones;
		this.maxTurns = maxTurns;
		this.maxPayload = maxPayload;
	}

	public void setProducts(ArrayList<IProduct> products) {
		// TODO Auto-generated method stub
		this.products = products;
	}
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IWarehouse> getWarehouses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IDrone> getDrones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IOrder> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDroneMaxWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
