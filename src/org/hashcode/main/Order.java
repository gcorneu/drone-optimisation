package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;

public class Order implements IOrder{
	private ArrayList<Integer> products;
	Point deliverTo;
	
	public Order(ArrayList<Integer> products, Point deliverTo) {
		this.products = products;
		this.deliverTo = deliverTo;
	}

	@Override
	public IWarehouse getWarehouse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSatisfied() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSatisfied(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IPackage> getPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
