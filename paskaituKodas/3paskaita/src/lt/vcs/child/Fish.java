package lt.vcs.child;

import lt.vcs.interfaces.Actions;
import lt.vcs.parent.Animals;

public class Fish extends Animals implements Actions {

    String water;

    String depth;

    public Fish(String water, String depth, String color, Float heigth, Float width, Integer weight) {
        super(color, heigth, width, weight);
        this.water = water;
        this.depth = depth;
    }
    
    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public String getVoice() {
        return " fish tyla............";
    }

}
