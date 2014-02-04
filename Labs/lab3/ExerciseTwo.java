/** 
* Excercise Two
* Lab Three
**/

import java.util.Scanner;

public class ExerciseTwo {

    public static void main( String[] args ) {
    
        // initialize a scanner object for getting input
        Scanner input = new Scanner( System.in );

        // create an integer variable to store the age to be tested
        int age;

        // ask user to enter the user's age
        System.out.println( "Enter your age");

        // store it in the integer variable
        age = input.nextInt();

        // print "Before the If...Else Statement"
        System.out.println( "Before the If...Else Statement");

        if (age < 21) {
            System.out.println( "Sorry kid, no cocktails for you.");
        }

            else {
                System.out.println( "Pick your poison. It's 5 o' clock somewhere!" );
            }

        // print "After the If...Else Statement"
        System.out.println( "After the If...Else Statement");
        
    }
}
