/*
 * Band Booster
 * Models a band booster who sells boxes of band candy and tracks total sales.
 */

public class BandBooster
{
    // Instance variables store the state of each BandBooster object.
    private String name;
    private int boxesSold;

    /*
     * Constructor
     * Initializes the booster name and sets boxesSold to 0.
     */
    public BandBooster(String boosterName)
    {
        name = boosterName;
        boxesSold = 0;
    }

    /*
     * Returns the name of this band booster.
     */
    public String getName()
    {
        // TODO: Return the booster name
        return name;
    }

    /*
     * Returns the total number of boxes sold so far.
     * This helps other classes compare boosters without accessing private data directly.
     */
    public int getBoxesSold()
    {
        // TODO: Return boxesSold
        return boxesSold;
    }

    /*
     * Adds additionalBoxes to the total boxesSold.
     */
    public void updateSales(int additionalBoxes)
    {
       boxesSold += additionalBoxes;
    }

    /*
     * Returns a formatted summary, for example: "Joe: 16 boxes"
     */
    public String toString()
    {
        // TODO: Return the formatted summary string
        return name + ": " + boxesSold + " boxes";
    }
}
