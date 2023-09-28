package OOP2.Shapes.Main;

public class Square extends Rectangle {


    public Square(String color, boolean isFilled, double length) {
        super(color, isFilled, length, length);
    }



    public double getLength() {
        System.out.println(length);
        return length;
    }

    @Override
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length  can't be negative or Null");
        }

      this.setLength(length);
        this.setWidth(length);
    }
    @Override
    public void setWidth(double width) {
        if (length <= 0) {
            throw new IllegalArgumentException("Width  can't be negative or Null");
        }

        this.setLength(width);
        this.setWidth(width);
    }
    @Override
    public void showOff() {

        System.out.println("Information of the Square:");
        System.out.println("Is the square filled: " + getIsFilled());
        System.out.println("The Color is: " + getColor());
        System.out.println("The Area of the Square is: " + getArea());
        System.out.println("The Perimeter of the Square is: " + getPerimeter());
    }
}
