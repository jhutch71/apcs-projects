/*
 * Project: Twenty Questions.. well, actually just Two
 * Description: Ask two questions (type and size) and make a guess based on the user's answers.
 * Students must implement nested if statements to produce one of six possible guesses.
 */

import java.util.Scanner;

public class TwentyQuestions
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();

        // 2) Ask for type: animal, vegetable, or mineral
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        System.out.print("> ");
        String type = scan.next(); // read one word

        // 3) Ask for size: bigger than a breadbox? yes/no
        System.out.println();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        String size = scan.next(); // read one word: yes or no

        // 4) TODO: Use nested if statements to choose among six outcomes.

        if (type.equalsIgnoreCase("animal")){
            if (size.equalsIgnoreCase("yes")){
                System.out.println("You're thinking of a fox!");
            }
            else {
                System.out.println("I think you're thinking of a squirrel.");
            }
        }
        else if (type.equalsIgnoreCase("vegetable")){
            if(size.equalsIgnoreCase("yes")){
                System.out.println("My guess is that you are thinking of a pumpkin.");
            }
            else {
                System.out.println("You're thinking of a carrot.");
            }
        }
        else {
            if(size.equalsIgnoreCase("yes")){
                System.out.println("I think you're thinking of a car.");
            }
            else {
                System.out.println("My guess is that you are thinking of a coin!");
            }
        }
        // 5) Closing line
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}
