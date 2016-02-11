package org.hashcode.main;

import java.util.List;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

interface IWarehouse {
    public List<IProduct> getProducts();

    public Vector2D setCoords(Vector2D coords);
    public Vector2D getCoords();
}
