package org.hashcode.main;

import java.util.ArrayList;
import org.hashcode.main.IProduct;
import java.util.List;

interface IMap {
    public int getWidth();
    public int getHeight();
    public void setProducts(ArrayList<IProduct> products);
    public List<IProduct> getProducts();
    public List<IWarehouse> getWarehouses();
    public List<IDrone> getDrones();
    public List<IOrder> getOrders();
    public int getCurrentTime();
    public int getMaxTime();
    public int getDroneMaxWeight();
}
