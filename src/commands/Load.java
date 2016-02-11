package commands;

import org.hashcode.main.IInstruction;


public class Load implements IInstruction{
	int distance=0;
	public Load(Point dest, Point currentLoc){
		distance=(int) dest.distance(currentLoc);
	}
	
	@Override
	public int getTimeTaken() {
		// TODO Auto-generated method stub
		return distance+1;
	}
}
