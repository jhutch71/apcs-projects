/*
 * Project: Bourne Coordinates
 * Description: A simple class that stores x and y values for a coordinate.
 * Student task: Override toString() so the object prints in a custom format.
 */
public class Coordinates {

    private final double x;
    private final double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
     * TODO: Uncomment and modify this method.
     * Goal format: [ x = 245.0, y = 180.0]
     */
    @Override
    public String toString() {
        return "[ x = " + x + ", y = " + y + "]";
    }
    
}
