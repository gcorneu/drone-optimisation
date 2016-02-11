package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javafx.geometry.Point2D;

public class Warehouse implements IWarehouse{
	private Point coords;
	private ArrayList<Integer> products;
	public Warehouse(Point coords, ArrayList<Integer> products) {
		this.coords = coords;
		this.products = products;
	}
	@Override
	public List<IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getCoords() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<IPackage> getPackages() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasPackages(ArrayList<IPackage> packs) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Point setCoords(Point coords) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
