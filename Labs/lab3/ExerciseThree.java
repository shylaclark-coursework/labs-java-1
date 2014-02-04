/** 
* Excercise Three
* Lab Three
**/

import java.util.Scanner;

public class ExerciseThree {

    public static void main( String[] args ) {

        // initialize a scanner object for getting input
        Scanner input = new Scanner( System.in );
        
        // integer variable to store number to be tested
        int number;

        // ask user to enter number to test
        System.out.println( "Enter number to test: ");

        // store number in int variable
        number = input.nextInt();

        if ( number <= 0 ) {
            System.out.println( "Invalid number, primes are positive");
        }

        else if ( (number%2) == 0 ) {
            System.out.println( "Not a prime");
        }

        else if ( (number%3) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%4) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%5) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%6) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%7) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%8) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%9) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( (number%10) == 0) {
            System.out.println( "Not a prime");
        }

        else if ( number > 100) {
            System.out.println( "Number is too large for this tester");
        }
        
        else {
            System.out.println( "The number is prime");
        }

    }
}
