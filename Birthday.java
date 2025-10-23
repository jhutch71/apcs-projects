/*
 * Project: Birthday Greeting Builder
 * Description: Practice string concatenation by adding a last name
 * and extra punctuation to complete a birthday greeting.
 */

public class Birthday
{
    public static void main(String[] args)
    {
        String start = "Happy Birthday";
        String name = "Jose";
        String last = "Hernandez";
        String result = start + " " + name + " " + last;  // add together strings
        
        // TODO: Create a new variable for last name
        
        
        // TODO: Add last name to result
        
        result += "!"; // add on to the same string
        result += "!";
        result += "!";
        
        // TODO: Add two more exclamation marks to result
        
        System.out.println(result);
    }
}