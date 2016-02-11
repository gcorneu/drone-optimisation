package org.hashcode.main;

import java.util.List;

interface IMap {
    public int getWidth();
    public int getHeight();
    public List<IWarehouse> getWarehouses();
    public List<IDrone> getDrones();
    public List<IOrder> getOrders();
    public int getDroneMaxWeight();
}
