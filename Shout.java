import java.util.*;

public class Shout extends ConsoleProgram
{
    @Override    
    public void run()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Whisper something to me: ");
        
        String message = scan.nextLine();
        String result = shoutify(message);
        
        System.out.println(result);
    }
    
    // YOU SHOULD ONLY BE MODIFYING LINE 19 
    public static String shoutify(String message)
    {
		return message.toUpperCase();
	}
    
}
