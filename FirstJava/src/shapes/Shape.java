package shapes;

public abstract class Shape {
  protected String color;
  protected boolean filled;

  Shape() {
    color = "red";
    filled = false;
  }

  Shape(String colorParam, boolean isFilled) {
    color = colorParam;
    filled = isFilled;
  }


  public String toString() {
    return "[color: " + color + ", isFilled: " + filled + "]";
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  abstract double getArea();
  abstract  double getPerimeter();
}
