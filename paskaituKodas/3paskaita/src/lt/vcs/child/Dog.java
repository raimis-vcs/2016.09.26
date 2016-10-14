package lt.vcs.child;

import lt.vcs.interfaces.Actions;
import lt.vcs.parent.Animals;

public class Dog extends Animals implements Actions{
     
    String tailLength;  
    
    String breed; 

    public Dog(String color, Float heigth, Float width, Integer weight) {
        super(color, heigth, width, weight);
    }

    public Dog() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String getVoice() {
        return "Hau ";
    }
    
}
