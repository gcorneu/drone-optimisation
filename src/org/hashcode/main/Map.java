package org.hashcode.main;

import java.awt.Point;
import java.util.ArrayList;
import org.hashcode.main.*;

import commands.Deliver;
import commands.Load;
import commands.Wait;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map implements IMap {

	static int myFUCK = 1000;
	private int width;
	private int height;
	private int numberOfDrones;
	private int maxTurns;
	private int currTurn;
	private int maxPayload;
	private ArrayList<IProduct> products;
	private ArrayList<IWarehouse> warehouses;
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
	
	public void setWarehouses(ArrayList<IWarehouse> warehouses) {
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
	public ArrayList<IWarehouse> getWarehouses() {
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
		return currTurn;
	}

	@Override
	public int getMaxTime() {
		return maxTurns;
	}
	
	public void growOld(){
		for (IDrone drone : drones) {
			if(drone.isIdle(currTurn)){
				drone.addInstructions(getPickup(drone));
			}
		}
		currTurn++;
		
	}
	
	private ArrayList<IInstruction> getPickup(IDrone drone){
		double bestONE=Double.POSITIVE_INFINITY;
		
		ArrayList<IInstruction> popopop =null;
		IWarehouse smile =null;
		IOrder orderingy =null;
		
		for (IOrder anOrder : orders) {
			if(!anOrder.isSatisfied()){
				double orderCost = 0;
				
				Entry<Integer, IWarehouse> myWares= findFactory((ArrayList<IPackage>) anOrder.getPackages(), drone.getCoords(), anOrder.getLocation());
				if(myWares!=null){
					orderCost += myWares.getKey()*myFUCK;
							
					for (IPackage p : anOrder.getPackages()) {
						orderCost += p.getAmount()*(p.getProduct().getWeight());	
					}
					
					if(bestONE>=orderCost){
						bestONE = orderCost;
						popopop = new ArrayList<IInstruction> ();
						IWarehouse smiley = myWares.getValue();
						smile=smiley;
						orderingy = anOrder;
						popopop.add(new Load(smile .getCoords(), drone.getCoords(), smile.getID(), anOrder.getPackages()));
						popopop.add(new Deliver(anOrder.getLocation(), smile.getCoords(), anOrder.getID(), anOrder.getPackages()));
					}
				}
			}
		}
		if(popopop!=null){
			smile.minusPackages(orderingy.getPackages());
			orderingy.setSatisfied(true);
		}else{

			popopop = new ArrayList<IInstruction> ();
			popopop.add(new Wait(100000));
		}
		return popopop;
	}
	
	private Entry<Integer, IWarehouse> findFactory(ArrayList<IPackage> packs, Point droneloc, Point orderLoc){
		TreeMap<Integer, IWarehouse> satWarehouse = new TreeMap<Integer, IWarehouse> ();
		for (IWarehouse wh : warehouses) {
			if(wh.hasPackages(packs)){
				Integer dist = (int) (Math.sqrt(droneloc.distanceSq(wh.getCoords())+orderLoc.distanceSq(wh.getCoords())));
				satWarehouse.put(dist, wh);
			}
		}
		if(!satWarehouse.isEmpty()){
			return satWarehouse.firstEntry();
		}else{
			//TODO FUCK THE GAME UP, LETS FIND MULTI PLACES
			return null;
		}
	}
	

}
