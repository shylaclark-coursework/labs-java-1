/** 
* Exercise Two
* Lab 6
* Shyla Clark
* Mar 11
**/

import java.util.*;

public class ExerciseTwo {
    
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );
		
		String[] binary = 
			{ "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111" };
		
		System.out.println( "Enter a number between 0 and 7 to convert to binary: " );
		int input = sc.nextInt();
		
		while( input < 0 || input > 7 ) {
			System.out.println( "No! Enter a number between 0 and 7!");
			input = sc.nextInt();
		} // while loop

		System.out.println( binary [ input] );

    } // end method main
} // end public class