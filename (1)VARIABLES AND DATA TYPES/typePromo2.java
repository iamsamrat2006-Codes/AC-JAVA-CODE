import java.util.Scanner;

public class typePromo2 {
  public static void main(String args[]){
   int a = 10;
   float b = 20.5f;
   long c = 30;
    double d = 40.5;
    double sum = a+b+c+d; //double ranges from 4.9e-324 to 1.7976931348623157e+308, so we need to typecast the sum of a, b and c to double
    System.out.println(sum);
  }
  //output: 101.0
}
