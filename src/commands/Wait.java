package commands;

import org.hashcode.main.IInstruction;


public class Wait implements IInstruction {

	int distance=0;
	public Wait(int time){
		distance=time;
	}
	
	@Override
	public int getTimeTaken() {
		// TODO Auto-generated method stub
		return distance;
	}

	@Override
	public String getOutput(int id) {
			
		return ""+id +" "+ "W" + " " + distance;
	}

}
