package OOP2.Shapes.Main;

public class Rectangle extends Shapes {

    double width;
    double length;


    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {

        return width * length;
    }

    @Override
    public double getPerimeter() {
        return  (width * 2) + (length * 2);
    }

    @Override
    public void showOff() {
        System.out.println("Information of the Rectangle:");
        System.out.println("Is the rectangle filled: " + getIsFilled());
        System.out.println("The Color is: " + getColor());
        System.out.println("The Area of the Rectangle is: " + getArea());
        System.out.println("The Perimeter of the rectangle is: " + getPerimeter());
    }


    public double getWidth() {
        System.out.println(width);
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width can't be negative or Null");
        }
        this.width = width;
    }

    public double getLength() {
        System.out.println(length);
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length can't be negative or Null");
        }

        this.length = length;
    }
}
