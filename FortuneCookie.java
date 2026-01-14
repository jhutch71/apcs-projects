// Starter Code: FortuneCookie.java
/*
 * Project: Fortune Cookie
 * Description: Prints a random fortune from a list and six lotto numbers (1–54).
 * The lotto numbers may repeat in the base version.
 */

public class FortuneCookie
{
    public static void main(String[] args)
    {
        // TODO: 1) Create a method that prints one of at least six fortune strings.
        int f = 0;
        String fortune = "";
        f = (int)(Math.random()*6) + 1;
        if (f == 1) {
            fortune = "An exciting opportunity lies ahead of you.";
        }
        else if (f==2 ){
            fortune = "Help! I'm trapped in the fortune cookie factory!";
        }
        else if (f == 3) {
            fortune = "Expect the unexpected.";
        }
        else if (f == 4){
            fortune = "You will win the lottery next week.";
        }
        else if (f == 5){
            fortune = "You cannot shake hands with a clenched fist.";
        }
        else {
            fortune = "Do or do not. There is no try.";
        }
        System.out.println("Fortune cookie says: \"" + fortune + "\"");
        int n = 0;
        String number = "";
        for (int i = 0; i < 6; i++) {
            n = (int)(Math.random()*54)+1;
            number = number+  n + " - ";
        }
        System.out.println(number.substring(0,number.length()-2));
        // TODO: 2) Use Math.random() to pick a fortune index.
        // TODO: 3) Print: Fortune cookie says: "<fortune>"
        // TODO: 4) Generate six integers in [1, 54] and print them as:
        //         n1 - n2 - n3 - n4 - n5 - n6  (with spaces exactly like this)
    }
}
