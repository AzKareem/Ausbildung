package OOP2.Shapes.Main;

public abstract class Shapes {


    private String color;
    private boolean isFilled;

    public Shapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }
    public abstract void showOff();
}

