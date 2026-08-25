import java.util.*;
public class InputTaking {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in); //creating scanner object
    // String input = sc.next(); //taking input from user
    // System.out.println(input);// input-- TONY STARK 
    //OUTPUT--TONY


    String name = sc.nextLine(); //taking input from user
    System.out.println(name); //printing input from user
    //INPUT--TONY STARK
    //OUTPUT--TONY STARK

    int number = sc.nextInt(); //taking input from user
    System.out.println(number); //printing input from user

    float decimal = sc.nextFloat(); //taking input from user
    System.out.println(decimal); //printing input from user
    sc.close(); //closing scanner object

  }
  
}
