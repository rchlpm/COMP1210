import java.util.Scanner;
/*
*
*
*
* @author Rachel Meredith
* @version 9/4/2020
*/
public class ExpressionResult {
/**
*
* @param args not used
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x;
      double y; 
      double z;
      double result;
   
      System.out.println("result = (x - 1.1) (2y + 2.2) / xyz");
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.println("\tEnter z: ");
      z = userInput.nextDouble();
      
      if ( x == 0 || y == 0 || z == 0 ) {
         result = 0.0;
      }
      else {
         result = ((( x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4))
               / (x * y * z));
      }
      System.out.println(result);
   }
}