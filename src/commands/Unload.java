package commands;

import org.hashcode.main.IInstruction;

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
}
