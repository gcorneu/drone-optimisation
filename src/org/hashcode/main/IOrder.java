package org.hashcode.main;

import java.util.List;

interface IOrder {
    /**
     * @return The warehouse that this package is currently at.
     **/
    public IWarehouse getWarehouse();
    public List<IPackage> getPackages();
    public boolean isSatisfied();
    public void setSatisfied(boolean b);
}
