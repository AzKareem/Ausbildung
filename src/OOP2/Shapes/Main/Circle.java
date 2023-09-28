package OOP2.Shapes.Main;

public class Circle extends Shapes {


    private double radius;


    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }



    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void showOff() {

        System.out.println("Information of the Circle:");
        System.out.println("Is the rectangle filled: " + getIsFilled());
        System.out.println("The Color is: " + getColor());
        System.out.println("The Area of the Circle is: " + getArea());
        System.out.println("The Perimeter of the Circle is: " + getPerimeter());
    }


    public double getRadius() {
        System.out.println(radius);
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can't be negative or Null");
        }
        this.radius = radius;
    }
}
