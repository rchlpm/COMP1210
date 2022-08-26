import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/*
*
*
* @author Rachel Meredith
* @version 1/29/20
*/
public class Event {
      /**
      *
      *
      * @param args not used.
      *
      */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
         
      System.out.print("Enter your event code: ");
         
      DecimalFormat fmt1 = new DecimalFormat ("$###,###.00");
      String x = userInput.nextLine();
      double price;
      char event;
      String month;
      String day;
      String year;
      String hour;
      String minutes;
      String section;
      String row;
      String seat;
      String discription;
      int discount;
      double cost;
      int prize;
        
      if (x.length() > 25) {
         x = x.trim();
         
         month = x.substring(0,2);
         day = x.substring(2,4);
         year = x.substring (4,8);
        
         hour = x.substring(8,10);
         minutes = x.substring(10,12);
        
         price = Double.parseDouble(x.substring(12,17));
         discount = Integer.parseInt(x.substring(17,19));
         cost = (price * 0.01) - ((price * 0.01) * (discount * 0.01));
         price *= 0.01;
         
         section = x.substring(19,21);
         row = x.substring(21,23);
         seat = x.substring(23,25);
         discription = x.substring(25,x.length());
         
      
         
         Random gen = new Random();
         prize = gen.nextInt(9999) + 1; 
                 
         System.out.print("\nEvent: " + discription);
         System.out.println("   Date: " + month + "/" + day + "/" + year 
            + "   Time: " + hour + ":" + minutes + "\nSection: " + section
            + "   Row: " + row + "   Seat: " + seat);
         System.out.println("Price: " + fmt1.format(price) 
            + "   Discount: " + discount + "%   Cost: " + fmt1.format(cost));
         System.out.println("Prize Number: " + prize);
      } else {
         System.out.println("\nInvalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      }
   }
}
        
