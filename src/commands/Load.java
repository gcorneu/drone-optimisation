package commands;

import org.hashcode.main.IInstruction;

import javafx.geometry.Point2D;

public class Load implements IInstruction{
	int distance=0;
	public Load(Point2D dest, Point2D currentLoc){
		distance=(int) dest.distance(currentLoc);
	}
	
	@Override
	public int getTimeTaken() {
		// TODO Auto-generated method stub
		return distance+1;
	}
}
