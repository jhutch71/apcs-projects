/*
 * Accessing Fields in Methods (PhraseRepeaterDriver)
 * Driver program that asks the user for a message, how many times to repeat it,
 * and whether to "shout" it (capitalize it), then prints the repeated result.
 */
import java.util.Scanner;

public class PhraseRepeaterDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = keyboard.nextLine();

        System.out.print("Number of times: ");
        int n = keyboard.nextInt();
        keyboard.nextLine(); // consume leftover newline after nextInt()

        System.out.print("Do you want to me to shout it at you?  ");
        String answer = keyboard.nextLine();

        // TODO: Set capitalize to true if the user typed "yes" (any capitalization).
        boolean capitalize = false;
        if (answer.equalsIgnoreCase("yes")){
            capitalize = true;
        }

        PhraseRepeater pr = new PhraseRepeater();
        pr.setValues(msg, n, capitalize); // THIS WILL NOT WORK UNTIL YOU FIX THE setValues METHOD TO USE THE THIRD PARAMETER
        System.out.println(pr.getRepeatedPhrase());
    }
}
