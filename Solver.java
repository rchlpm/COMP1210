import java.util.Scanner;
import java.text.DecimalFormat;
/**
*
*
* @author Rachel Meredith
* @version 1/29/20
*/
public class Solver {
/**
*
*
* @param args not used
*
*/
   public static void main(String[] args) {
      double x;
      double result;
      String numbers;
      int numbersLeft;
      int numbersRight;
      Scanner userInput = new Scanner(System.in);
   
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
   
      result = (Math.sqrt(Math.abs((11 * Math.pow(x, 4)) + (9 * Math.pow(x, 3))
         + (7 * Math.pow(x, 2)) + (5 * Math.pow(x, 1)) + 4)))
         / ((2 * Math.pow(x, 1)) + 4);
      System.out.println("Result: " + result);
      
      numbers = Double.toString(result);
      int index = numbers.indexOf('.');
      String numberL = numbers.substring(0, index);
      String numberR = numbers.substring(index + 1, numbers.length());
      numbersLeft = numberL.length();
      numbersRight = numberR.length();
      
      DecimalFormat fmt1 = new DecimalFormat("##,##0.0####");
      
      System.out.println("# of characters to left of decimal point: " 
         + numbersLeft);
      System.out.println("# of characters to right of decimal point: " 
         + numbersRight);
      System.out.println("Formatted Result: " + fmt1.format(result));
   }
}