package org.hashcode.main;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class Drone implements IDrone {
    private List<IInstruction> instructions;
    private Point coords;
    private int weight;
    private int max;

    public Drone(Point coords, int weight, int max) {
        this.instructions = new ArrayList<IInstruction>();
        this.coords = coords;
        this.weight = weight;
        this.max = max;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getRemaningWeight() {
        return this.max - this.weight;
    }
    
    @Override
    public boolean isIdle(int time) {
    	return false;
    }

	@Override
	public List<IInstruction> getInstructions() {
		return this.instructions;
	}

	@Override
	public void setCoords(Point coords) {
		this.coords = coords;
	}

	@Override
	public Point getCoords() {
		return this.coords;
	}

	@Override
	public int getRemainingWeight() {
		return this.weight;
	}
}
