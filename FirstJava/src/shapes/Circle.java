package shapes;

public class Circle extends Shape {
  private double radius;

  Circle() {
    super();
    radius = 1.0;
  }

  Circle(double radius) {
    super();
    this.radius = radius;
  }

  Circle(double radius, String color, boolean isFilled) {
    super(color, isFilled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }
}
