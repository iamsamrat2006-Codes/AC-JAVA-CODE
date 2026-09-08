import java.util.Scanner;

public class typePro1a {
  public static void main(String args[]){
    short a = 10;
    byte b = 20;
    char c = 'a';
    byte bt = (byte) (a+b+c); //byte ranges from -128 to 127, so we need to typecast the sum of a, b and c to byte
    System.out.println(bt);
  }
}//output: 127
