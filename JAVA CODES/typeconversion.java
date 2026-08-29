//CONVERSION HAPPENS WHEN WE ASSIGN A VALUE OF ONE DATA TYPE TO ANOTHER DATA TYPE.
//= TYPE COMPATIBLE DATA TYPES // DESTINATION TYPE size eg.long>> SOURCE TYPE size eg.int
//long conversion of <int to long > is possible but not vice versa because long is bigger than int. [long>>int]
//===implicit type conversion (typecasting) is done by the compiler automatically when we assign a value of one data type to another data type.
//example: int a = 10; float b = a; // implicit type conversion
//===widening conversion: when we assign a value of smaller data type to a bigger data type. eg. int to long, float to double, char to int etc.
//===explicit type conversion (typecasting) is done by the programmer when we assign a value of one data type to another data type.
//example: int a = 10; float b = (float)a; // explicit type conversion



public class typeconversion {
  public static void main(String args[]) {
    int a = 10;
    float b = a; // implicit type conversion
    System.out.println(b);
  } //output: 10.0

  
}
