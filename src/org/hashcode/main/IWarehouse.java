package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


interface IWarehouse {
	public List<IPackage> getPackages();
    public Point setCoords(Point coords);
    public Point getCoords();
	public boolean hasPackages(ArrayList<IPackage> packs);
}
