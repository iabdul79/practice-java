import java.util.Arrays;

class CircleImpl {
  private double radius;
  private String color;

  public CircleImpl() {
    radius = 0.1;
    color = "red";
  }

  public CircleImpl(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return 2*radius*Math.PI;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Circle: [radius: " + radius + " color: " + color + " with area: " + this.getArea() + "]";
  }
}

public class Circle {
  public static void main(String[] args) {
    CircleImpl circle1 = new CircleImpl(20.0);
    CircleImpl circle2 = new CircleImpl();
    System.out.println(circle1);
    System.out.println(circle2);
    System.out.println("Circle 1 radius: " + circle1.getRadius() + " area: " + circle1.getArea());
    System.out.println("Circle 2 radius: " + circle2.getRadius() + " area: " + circle2.getArea());
  }

}


