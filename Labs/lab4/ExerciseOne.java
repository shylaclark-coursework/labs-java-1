/** 
* Excercise One
* Lab Four
**/

import java.util.Scanner;

public class ExerciseOne { 

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in); // create and initialize scanner

        int iterations; // create variable to store number of iterations

        // ask the user for the number of iterations desired
        System.out.print( "Enter number of iterations desired: " );
        iterations = input.nextInt(); // store value into variable

        for ( int i = 1; i <= iterations; i++ )
        System.out.println( "The program has looped " + i + "times.");

        System.out.println(); // output a newline
        
    } // end main
} // end class ExerciseOne
