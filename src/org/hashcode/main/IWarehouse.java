package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


interface IWarehouse {
	public int getID();
	public List<IPackage> getPackages();
    public Point setCoords(Point coords);
    public Point getCoords();
    public boolean hasPackages(ArrayList<IPackage> packs);
	public boolean minusPackages(ArrayList<IPackage> packs);
	List<IProduct> getProducts();
}
