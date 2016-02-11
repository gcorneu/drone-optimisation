package org.hashcode.main;

import java.util.List;


import javafx.geometry.Point2D;

interface IDrone {
    public List<IInstruction> getInstructions();

    public void setCoords(Point2D coords);
    public Point2D getCoords();
    
    public boolean isIdle(int time);

    public void setWeight(int weight);
    public int getWeight();
    public int getRemainingWeight();
}
