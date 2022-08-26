import java.util.Scanner;
/**
*takes the user input and then 
*
* @author Rachel Meredith
* @version 1/22/2020
*/
public class SquareUnits {
   /**
   *
   *
   * @param args not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int squareUnits;
      int acres = 0;
      int square_yards = 0;
      int square_feet = 0;
      int square_inches = 0;
   
      System.out.print("Enter the area in square inches: ");
      squareUnits = userInput.nextInt();
      if (squareUnits > 500) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      } 
      else {
         // find the denominations of the money from the input
         acres = squareUnits / 6272640;
         squareUnits = squareUnits % 6272640;8
         square_yards = squareUnits / 1296;
         squareUnits = squareUnits % 1296;
         square_feet = squareUnits / 144;
         squareUnits = squareUnits % 144;
         square_inches = squareUnits;
         
         //prints it in respect to the bills
         System.out.println("Number of Units:");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + square_yards);
         System.out.println("\tSquare Feet: " + square_feet);
         System.out.println("\tSquare Inches: " + square_inches);
         
        
      }
   }
}