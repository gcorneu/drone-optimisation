package org.hashcode.main;

import java.util.List;

import javafx.geometry.Point2D;

interface IWarehouse {
    public List<IProduct> getProducts();

    public Point2D setCoords(Point2D coords);
    public Point2D getCoords();
}
