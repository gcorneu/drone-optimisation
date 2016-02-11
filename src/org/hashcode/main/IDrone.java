package org.hashcode.main;

import java.util.List;


import java.awt.Point;

public interface IDrone {
    public List<IInstruction> getInstructions();

    public void setCoords(Point coords);
    public Point getCoords();
    
    public boolean isIdle(int time);

    public void setWeight(int weight);
    public int getWeight();
    public int getRemainingWeight();
}
