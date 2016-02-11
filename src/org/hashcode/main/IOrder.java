package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


interface IOrder {
    /**
     * @return The warehouse that this package is currently at.
     **/
	public int getID();
    public IWarehouse getWarehouse();
    public ArrayList<IPackage> getPackages();
    public Point getLocation();
    public boolean isSatisfied();
    public void setSatisfied(boolean b);
	List<Integer> getProducts();
}
