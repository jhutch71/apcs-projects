/*
 * Project: Box Constructor Demo
 * Description: Represents a 3D box object with width, height, and depth.
 * Supports creation of a custom-sized box or a cube via overloaded constructors.
 */
public class Box
{
    private int width;
    private int height;
    private int depth;

    // Constructor for a custom-sized box
    public Box(int w, int h, int d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor for a cube
    public Box(int len)
    {
        width = len;
        height = len;
        depth = len;
    }

    // Displays the dimensions of the box
    public void show()
    {
        System.out.println("width: " + width + "\theight:\t " + height + "\tdepth: " + depth);
    }
}