package Fundamentos;

public class NumeroString {
  public static void main(String[] args) {
    Integer num1 = 10_000;
    System.out.println(num1.toString().length());

    int num2 = 100_000;
    System.out.println(Integer.toString(num2).length());

    System.out.println("" + num2);
  }
}