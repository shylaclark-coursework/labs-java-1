/** 
* Exercise Four
* Lab 4
* Shyla Clark
* Feb 18
**/

import java.util.Scanner; // create and initialize scanner

public class ExerciseFour {

    public static void main( String[] args ) {
            Scanner input = new Scanner(System.in);
			
			int userNumber; // user choice
			
            System.out.println( "Choose integer between zero and 10. " ); // ask user for integer
            userNumber = input.nextInt(); // store value into variable
			
			if (( userNumber >= 0 ) && ( userNumber <= 10 ))
				System.out.println( "Valid number. " );
			
            System.out.println( "Choose integer divisible by 2 or 3. " ); // ask user for integer
            userNumber = input.nextInt(); // store value into variable
			
			if (( userNumber % 2 == 0 ) || ( userNumber % 3 == 0 ))
				System.out.println( "Valid number. " );
			
            System.out.println( "Choose an integer that is negative and even or positive and odd. " ); // ask user
            userNumber = input.nextInt(); // store value into variable
			
			if (( userNumber < 0 ) && ( userNumber % 2 == 0 ) || ( userNumber > 0 ) && ( userNumber % 2 == 1 ))
				System.out.println( "Valid number. " );
			
            System.out.println( "Choose an integer that is divisible by 2 or 5, but not both. " ); // ask user
            userNumber = input.nextInt(); // store value into variable
	
			
			if ((userNumber % 2 == 0 || userNumber % 5 == 0) && !(userNumber % 2 == 0 && userNumber % 5 == 0));
			System.out.println( "Valid number. " );

    } // end main
} // end public class ExerciseFour