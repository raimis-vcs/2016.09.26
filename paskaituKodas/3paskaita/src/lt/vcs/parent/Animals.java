package lt.vcs.parent;

public class Animals {

    String color; //dfdf

    Float heigth;

    Float width;

    Integer weight;

    public Animals(String color, Float heigth, Float width, Integer weight) {
        this.color = color;
        this.heigth = heigth;
        this.width = width;
        this.weight = weight;
    }
      
    public Animals() {
    }

    public void animalsColor() {
        System.out.println();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getHeigth() {
        return heigth;
    }

    public void setHeigth(Float heigth) {
        this.heigth = heigth;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
