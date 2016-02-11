package org.hashcode.main;

import java.util.ArrayList;
import org.hashcode.main.*;
import java.util.List;

public class Map implements IMap {

	private int width;
	private int height;
	private int numberOfDrones;
	private int maxTurns;
	private int currTurn;
	private int maxPayload;
	
	private List<IProduct> products;
	private List<IWarehouse> warehouses;
	private List<IDrone> drones;
	private List<IOrder> orders;
	
	public Map(int width, int height, int numberOfDrones, int maxTurns, int maxPayload) {
		this.width = width;
		this.height = height;
		this.numberOfDrones = numberOfDrones;
		this.maxTurns = maxTurns;
		this.maxPayload = maxPayload;
		
		currTurn=0;
		
		this.warehouses = new ArrayList<IWarehouse>();
		this.drones = new ArrayList<IDrone>();
	}

	@Override
    public void setProducts(ArrayList<IProduct> products) {
		
		this.products = products;
	}
	
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
	public List<IWarehouse> getWarehouses() {
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
		return null;
	}
	

}
