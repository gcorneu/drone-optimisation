package org.hashcode.main;

import java.util.List;

import javafx.geometry.Point2D;

interface IOrder {
    /**
     * @return The warehouse that this package is currently at.
     **/
    public IWarehouse getWarehouse();
    public List<IPackage> getPackages();
    public Point2D getLocation();
    public boolean isSatisfied();
    public void setSatisfied(boolean b);
	List<IProduct> getProducts();
}
