package commands;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import org.hashcode.main.IInstruction;
import org.hashcode.main.IPackage;


public class Load implements IInstruction{
	private int distance=0;
	private int wareID =0;
	private ArrayList<IPackage> packages;
	public Load(Point dest, Point currentLoc,int id, ArrayList<IPackage> list){
		distance=(int) dest.distance(currentLoc);
		wareID=id;
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

	public int getWareID() {
		return wareID;
	}

}
