package Fundamentos;

public class Wrappers {
  public static void main(String[] args) {
    Byte b = 100;
    Short s = 1000;
    Integer i = 10_000;
    Long l = 100000L;

    System.out.println(b.byteValue());
    System.out.println(s.toString());

    Float f = 123.0F;

    Boolean bo = Boolean.parseBoolean("true");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());

    Character c = '#';
    System.out.println(c + "...");
  }
}
