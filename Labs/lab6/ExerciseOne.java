/** 
* Exercise One
* Lab 6
* Shyla Clark
* Mar 11
**/

import java.util.Scanner; // create and initialize scanner
import java.util.*;

public class ExerciseOne {
    
	public static void main( String[] args ) {
			
	    int array1[] = new int[10];
		String[] month = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
		
		for( int i = 0; i < array1.length; i++ ) {
			array1[i] = (int)( Math.random() * 20 );
			System.out.println(array1[i]);
		} // end for loop
		
		int number = (int)( Math.random() * 20 );
		
		while( number < 0 || number > 11 ) {
			if( number < 0 ) {
				number = number + 4;
			} // end if
			else {
				number = number - 4;
			} // end else
		} // end while

		System.out.println( month [ number] );

    } // end method main
} // end public class