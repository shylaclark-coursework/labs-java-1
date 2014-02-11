/** 
* Excercise Two
* Lab 4
**/

import java.util.Scanner; // create and initialize scanner

public class ExerciseTwo {

    public static void main( String[] args ) {
    
        Scanner input = new Scanner(System.in);

        int month; // initialize counter

        // ask the user for the number of a month
        do {
            System.out.print( "Enter numerical month: " );
            month = input.nextInt(); // store value into variable

        } while (( month < 0) || (month > 12 )); // end do... while

        System.out.println(); // outputs a newline
        
    } // end main
} // end class ExerciseTwo
