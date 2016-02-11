package org.hashcode.main;

import java.util.ArrayList;
import java.util.List;

interface IMap {
    public int getWidth();
    public int getHeight();
    public void setProducts(ArrayList<IProduct> products);
    public List<IWarehouse> getWarehouses();
    public List<IDrone> getDrones();
    public List<IOrder> getOrders();
    public int getDroneMaxWeight();
}
