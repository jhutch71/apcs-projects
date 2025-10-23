/*
 * Project: Box Constructor Demo
 * Description: Demonstrates creating Box objects using two different constructors:
 * one that takes width, height, and depth, and one that takes a single length for a cube.
 */
public class BoxFactory
{
    public static void main( String[] args )
    {
        // TODO: Analyze the constructors in the Box.java class.
        // Create two instances of a Box showing that you can use both constructors.
        // Use variable names that will make the code below work.
        Box box1 = new Box(5 ,8 ,12);
        
        Box box2 = new Box(7);
        // Output box dimensions
        System.out.print("box1 has ");
        box1.show();

        System.out.print("box2 has ");
        box2.show();
    }
}