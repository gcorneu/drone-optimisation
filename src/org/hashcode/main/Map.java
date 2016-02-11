package org.hashcode.main;

import java.util.ArrayList;
import org.hashcode.main.*;

import javafx.geometry.Point2D;

import java.util.List;
import java.util.TreeMap;

public class Map implements IMap {

	private int width;
	private int height;
	private int numberOfDrones;
	private int maxTurns;
	private int currTurn;
	private int maxPayload;
	private ArrayList<IProduct> products;
	private ArrayList<Warehouse> warehouses;
	private List<IDrone> drones;
	private List<IOrder> orders;
	
	public Map(int width, int height, int numberOfDrones, int maxTurns, int maxPayload) {
		this.width = width;
		this.height = height;
		this.numberOfDrones = numberOfDrones;
		this.maxTurns = maxTurns;
		this.maxPayload = maxPayload;
		
		currTurn=0;
	}

	@Override
    public void setProducts(ArrayList<IProduct> products) {
		
		this.products = products;
	}
	
	public void setWarehouses(ArrayList<Warehouse> warehouses) {
		this.warehouses = warehouses; }
	
	public List<IProduct> getProducts() {
		return this.products;
	}
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public ArrayList<Warehouse> getWarehouses() {
		return this.warehouses;
	}

	@Override
	public List<IDrone> getDrones() {
		return this.drones;
	}

	@Override
	public List<IOrder> getOrders() {
		return this.orders;
	}

	@Override
	public int getDroneMaxWeight() {
		return this.maxPayload;
	}

	@Override
	public int getCurrentTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxTime() {
		return maxTurns;
	}
	
	public int growOld(){
		for (IDrone drone : drones) {
			if(drone.isIdle(currTurn)){
				
			}
		}
		return 0;
	}
	
	private ArrayList<IInstruction> getPickup(){
		for (IOrder anOrder : orders) {
			double orderCost = 0;
			for (IPackage p : anOrder.getPackages()) {
				orderCost += p.getAmount()*(p.getProduct().getWeight());
				
			}
			
		}
		return null;
	}
	
	private IWarehouse findFactory(ArrayList<IPackage> packs, Point2D loc){
		TreeMap<Integer, IWarehouse> satWarehouse = new TreeMap<Integer, IWarehouse> ();
		for (IWarehouse wh : warehouses) {
			if(wh.hasPackages(packs)){
				satWarehouse.put((int) loc.distance(wh.getCoords()), wh);
			}
		}
		if(!satWarehouse.isEmpty()){
			return satWarehouse.firstEntry().getValue();
		}else{
			//TODO FUCK THE GAME UP, LETS FIND MULTI PLACES
			return null;
		}
	}
	

}
