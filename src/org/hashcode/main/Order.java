package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;

public class Order implements IOrder{
	private ArrayList<Integer> products;
	private IWarehouse warehouse;
	private boolean satisfied;
	private List<IPackage> packages;
	Point deliverTo;
	
	public Order(ArrayList<Integer> products, Point deliverTo) {
		this.products = products;
		this.deliverTo = deliverTo;
	}

	@Override
	public IWarehouse getWarehouse() {
		// TODO Auto-generated method stub
		return this.warehouse;
	}

	@Override
	public List<Integer> getProducts() {
		// TODO Auto-generated method stub
		return this.products;
	}

	@Override
	public boolean isSatisfied() {
		return this.satisfied;
	}

	@Override
	public void setSatisfied(boolean b) {
		this.satisfied = b;
	}

	

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<IPackage> getPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
