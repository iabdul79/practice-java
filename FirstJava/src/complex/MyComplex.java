package complex;

public class MyComplex {

  private double real;
  private double imaginary;

  MyComplex() {
    real = 0.0;
    imaginary = 0.0;
  }

  MyComplex(double realParam, double imaginaryParam) {
    real = realParam;
    imaginary = imaginaryParam;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  public void setValue(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public String toString() {
    return real + "+" + imaginary + "i";
  }

  public boolean isReal() {
    return imaginary <= 0;
  }

  public boolean isImaginary() {
    return imaginary > 0;
  }

  public double magnitude() {
    return Math.sqrt(Math.pow(real, 2)+ Math.pow(imaginary, 2));
  }

  public MyComplex addInto(MyComplex right) {
    real += right.real;
    imaginary += right.imaginary;
    return this;
  }

  public MyComplex addNew(MyComplex right) {
    double newReal = real + right.real;
    double newImaginary = imaginary + right.imaginary;
    return new MyComplex(newReal, newImaginary);
  }




}
