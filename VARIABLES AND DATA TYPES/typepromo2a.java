import java.util.Scanner;

public class typepromo2a {
  public static void main(String args[]){
  byte b= 5;
  byte a =(byte)(b*2); //byte ranges from -128 to 127, so we need to typecast the product of b and 2 to byte
  System.out.println(a);
  }
  //output: 10
  
}
