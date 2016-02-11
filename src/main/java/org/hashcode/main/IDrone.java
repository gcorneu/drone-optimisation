package org.hashcode.main;

import java.util.List;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

interface IDrone {
    public List<IInstruction> getInstructions();

    public void setCoords(Vector2D coords);
    public Vector2D getCoords();

    public void setWeight(int weight);
    public int getWeight();
    public int getRemainingWeight();
}
