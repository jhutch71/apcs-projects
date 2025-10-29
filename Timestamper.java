// Timestamper.java (Starter File)
/*
 * Project: Timestamp Difference Calculator
 * Description: Accepts two timestamps (in seconds since 1970) and outputs the
 * difference in hours and minutes. The calculation is handled by a method
 * called displayDifference.
 */

import java.util.Scanner;

public class Timestamper
{
    // Displays the human readable difference between time1 and time2
    public void displayDifference (int time1, int time2)
    {
        // TODO: Find absolute difference, break into hours and minutes, and print
        int diff = Math.abs(time1-time2);
        int h = diff / 3600;
        int m = diff % 3600 / 60;
        System.out.println(h + " hour(s) " + m + " minute(s)");
    }
    
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter timestamp 1: ");
        int first = kb.nextInt();
        
        System.out.print("Enter timestamp 2: ");
        int second = kb.nextInt();
        
        // Create a new Timestamper object
        Timestamper stamper = new Timestamper();
        
        // Display the difference between the first and second times
        stamper.displayDifference(first, second);
    }
}
