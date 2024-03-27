import org.w3c.dom.css.Rect;

class RectangeImpl {
  private float length;
  private float width;

  public RectangeImpl(float length, float width) {
    this.length = length;
    this.width = width;
  }

  public float getArea() {
    return length * width;
  }

  @Override
  public String toString() {
    return "RectangeImpl {" +
        "length=" + length +
        ", width=" + width +
        "}";
  }
}

public class Rectangle {
  public static void main(String[] args) {
    RectangeImpl rectangle = new RectangeImpl(10, 4);
    System.out.println(rectangle);
    System.out.println("Area: " + rectangle.getArea());
  }
}
