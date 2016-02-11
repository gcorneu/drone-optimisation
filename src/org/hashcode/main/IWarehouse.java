package org.hashcode.main;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;

interface IWarehouse {
	public List<IPackage> getPackages();
    public Point2D setCoords(Point2D coords);
    public Point2D getCoords();
	public boolean hasPackages(ArrayList<IPackage> packs);
	List<IProduct> getProducts();
}
