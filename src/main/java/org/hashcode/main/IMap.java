package org.hashcode.main;

import java.util.List;

interface IMap {
    public int getWidth();
    public int getHeight();
    public List<IWarehouse> getWarehouses();
    public List<IDrones> getDrones();
    public List<IOrders> getOrders();
    public int getDroneMaxWeight();
}
