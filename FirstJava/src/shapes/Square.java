package shapes;

public class Square extends Rectangle {
  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(String colorParam, boolean isFilled, double side) {
    super(colorParam, isFilled, side, side);
  }

  public String toString() {
    return "Square{" +
        super.toString() +
        "}";
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public void setWidth(double side) {
    super.setWidth(side);
    super.setLength(side);
  }
}
