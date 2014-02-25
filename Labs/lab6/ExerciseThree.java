/** 
* Exercise Three
* Lab 6
* Shyla Clark
* Mar 11
**/

import java.util.Scanner; // create and initialize scanner
import java.util.*;

public class ExerciseThree {
    
	public static void main( String[] args ) {
	
	Scanner sc = new Scanner( System.in );
		
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		
		int count = 0;
		int count2 = 0;
		
		while ( count < 6 ) {
			System.out.println( "Enter a number: " );
			
			if ( count < 3 ) {
				int temp = sc.nextInt();
				array1[count] = temp;
				count = count +1;
			} // end if
			
			else {
				int temp = sc.nextInt();
				array2[ count2 ] = temp;
				count = count + 1;
				count2 = count2 + 1;
			} // end else
			
		} // end while
		
		System.out.println( dotProduct( array1, array2 ));
		
	} // end method main
	
		public static int dotProduct( int[] a1, int[] a2 ) {
			
			int sum = 0;
			
			for ( int i = 0; i < a1.length; i++) {
				sum = sum + ( a1[ i ] * a2[ i ] );
			} // end for
			
			return sum;
			
		} // end dotProduct
		
} // end public class
