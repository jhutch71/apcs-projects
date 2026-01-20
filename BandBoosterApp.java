/*
 * Band Booster
 * Uses BandBooster objects to track sales for two boosters across three weeks,
 * practicing passing and returning object references (Unit 3.6).
 */

import java.util.Scanner;

public class BandBoosterApp
{
    /*
     * Prompts for one week's sales and updates the given booster.
     * Unit 3.6 connection: the method receives an object reference.
     */
    public static void recordWeekSales(Scanner input, BandBooster booster, int week)
    {
        System.out.print("Enter the number of boxes sold by " + booster.getName()
            + " in week " + week + ": ");
        int sold = input.nextInt();

        booster.updateSales(sold);
    }

    /*
     * Returns a reference to the BandBooster with the higher total.
     * If tied, returns the first parameter.
     */
    public static BandBooster topSeller(BandBooster first, BandBooster second)
    {
        // TODO: Compare totals using getBoxesSold and return the reference to the top seller
        
        if (second.getBoxesSold() > first.getBoxesSold()) {
            return second;
        }
        else {
            return first;
        }
        
        
        
        
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter booster #1 name: ");
        String name1 = input.nextLine();

        System.out.print("Enter booster #2 name: ");
        String name2 = input.nextLine();

        // TODO: Construct two BandBooster objects using name1 and name2
        BandBooster booster1 = new BandBooster(name1);
        BandBooster booster2 = new BandBooster(name2);

        // TODO: Loop for weeks 1 to 3 and call recordWeekSales for each booster each week
        // Hint: for (int week = 1; week <= 3; week++) { ... }
        
        for (int week = 1; week <= 3; week++) {
            System.out.println("\nWeek " + week + " sales:");
            recordWeekSales(input, booster1, week);
            recordWeekSales(input, booster2, week);
        }

        System.out.println();
        System.out.println("Totals:");
    
        System.out.println(booster1);
        System.out.println(booster2);

        // TODO: Call topSeller and print the winner's name
        BandBooster winner = topSeller(booster1, booster2);
        System.out.println("Top Seller: " + winner.getName());

        input.close();
    }
}
