package commands;

import java.awt.Point;
import java.util.ArrayList;

import org.hashcode.main.IInstruction;
import org.hashcode.main.IPackage;

public class Deliver implements IInstruction{
	private int distance =0;
	private int custID =0;
	private ArrayList<IPackage> packages;
	public Deliver(Point dest, Point wareLoc,int id, ArrayList<IPackage> list){
		distance = (int) dest.distance(wareLoc);
		custID = id;
		this.packages = list;
	}
	
	public ArrayList<IPackage> getPackages(){
		return packages;
	}
	@Override
	public int getTimeTaken() {
		// TODO Auto-generated method stub
		return distance+1;
	}
	

	public int getCustID() {
		return custID;
	}
}
