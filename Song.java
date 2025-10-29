/*
 * Project: Cumulative Song — Static Methods Practice
 * Description: Print a cumulative song using static helper methods to avoid
 * repetition. The first five verses must match the given text exactly. The
 * final verse is a custom verse stored in CUSTOM_VERSE for automated grading.
 *
 * Instructions:
 * - Keep main free of any non-blank println text. Call helper methods only.
 * - Create methods for repeated lines and for each verse assembly.
 * - Use the constant CUSTOM_VERSE for the final verse during grading.
 */

public class Song
{
    public static void main(String[] args) {
        printChorusStart();
        printChorusEnd();
        System.out.println();
        printChorusStart();
        printVerse1();
        printChorusEnd();
        System.out.println();
        printChorusStart();
        printVerse2();
        printVerse1();
        printChorusEnd();
        System.out.println();
        printChorusStart();
        printVerse3();
        printVerse2();
        printVerse1();
        printChorusEnd();
        System.out.println();
        printChorusStart();
        printVerse4();
        printVerse3();
        printVerse2();
        printVerse1();
        printChorusEnd();
        System.out.println();
        printChorusStart();
        printVerse5();
        printVerse4();
        printVerse3();
        printVerse2();
        printVerse1();
        printChorusEnd();
        
    }
    
    private static void printChorusStart() {
        System.out.println("Hey homies, my code is gonna rock this place");
        System.out.println("With a method named main and a curly brace");
    }
    
    private static void printChorusEnd() {
        System.out.println("I put a semicolon at the end of each line");
        System.out.println("You haters never seen code that looked so fine");
    }
    
    private static void printVerse1() {
        System.out.println("Mr. T loves my code, no need to debug");
        System.out.println("I can rap in Java until it unplug");
    }
        
    private static void printVerse2() {
        System.out.println("The first time I try, my code compiles");
        System.out.println("Lost a point for style cause my comments are vile");
    }
    
    private static void printVerse3() {
        System.out.println("Got help from Mr. T and it was swell But");
        System.out.println("I didn't need it cause I code so well");
    }
    
    private static void printVerse4() {
        System.out.println("I got full credit on external correctness");
        System.out.println("Hey playa check this, my code eats yours for breakfast");
    }
    
    private static void printVerse5() {
        System.out.println("You're still on \"Hello, World,\" what a disgrace");
        System.out.println("I'm building full apps at a killer pace");
    }
    
    
}