package shapes;

public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle() {
    super();
    length = 1.0;
    width = 1.0;
  }

  public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  public Rectangle(String colorParam, boolean isFilled, double length, double width) {
    super(colorParam, isFilled);
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getArea() {
    return length*width;
  }

  public  double getPerimeter() {
    return 2*length*width;
  }

  public String toString() {
    return "Rectangle{" +
        "length=" + length +
        ", width=" + width +
        '}';
  }
}
