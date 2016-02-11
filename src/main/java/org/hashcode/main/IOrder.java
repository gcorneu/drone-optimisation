package org.hashcode.main;

import java.util.List;

interface IOrder {
    /**
     * @return The warehouse that this package is currently at.
     **/
    public IWarehouse getWarehouse();
    public List<IProduct> getProducts();
    public boolean isSatisfied();
    public void setSatisfied(boolean b);
}
