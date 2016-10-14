package lt.vcs.child;

import java.util.List;

import lt.vcs.parent.Animals;
import lt.vcs.interfaces.Actions;

public class Cat extends Animals implements Actions {

    String eyeColor;

    String character;
    
    Object JauKazkasYra;
    
    Dog suniukas;
    
    List<Dog> tragedija;
    
    List<Cat> manoVaikai;

    public Cat(String eyeColor, String character, String color, Float heigth, Float width, Integer weight) {
        super(color, heigth, width, weight);
        this.eyeColor = eyeColor;
        this.character = character;
    }

    public Cat() {
        super();
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String getVoice() {
        return "miau miau miau!";
    }

}
