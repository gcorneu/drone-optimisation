package commands;

import java.awt.Point;

import org.hashcode.main.IInstruction;
import org.hashcode.main.IPackage;

public class Unload implements IInstruction{

	int distance=0;
	public Unload(Point dest, Point currentLoc){
		distance=(int) dest.distance(currentLoc);
	}
	
	@Override
	public int getTimeTaken() {
		// TODO Auto-generated method stub
		return distance+1;
	}
	
	@Override
	public String getOutput(int id) {
		return "";
	}
	
}
