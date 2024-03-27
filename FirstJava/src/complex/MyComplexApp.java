package complex;

public class MyComplexApp {

  public static void main(String[] args) {
    MyComplex number1 = new MyComplex(1.1, 2.2);
    MyComplex number2 = new MyComplex(3.3, 4.4);

    System.out.println("Number - 1 is " + number1.toString());
    System.out.println("Number - 2 is " + number2.toString());
    System.out.println("Add new number-1 and number-2 " + number1.addNew(number2).toString());
    System.out.println("Add into number-2 in number-1" + number1.addInto(number2).toString());
  }
}
