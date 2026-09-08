//TYPECASTING IN JAVA MEANS CONVERTING ONE DATA TYPE INTO ANOTHER DATA TYPE. IT IS OF TWO TYPES:-
//  1. IMPLICIT TYPECASTING (WIDENING CONVERSION)
//  2. EXPLICIT TYPECASTING (NARROWING CONVERSION)




import java.util.Scanner;
public class typecasting {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float a =25.12f;
    int b = (int)a; // explicit type conversion
    System.out.println(b);  } //output: 25
//here there is loss of data because we are converting a float value into an int value. so the decimal part is lost.
  
}
