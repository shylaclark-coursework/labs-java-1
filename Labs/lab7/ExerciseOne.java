/** 
* Exercise One
* Lab 7
* Shyla Clark
* Mar 18
**/

import java.util.*;

public class ExerciseOne {
    
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );
		
		String string1 = "";
		String string2 = "";
		String check = "-1";
		boolean equal = false;
		int compare = 0;
		int length1 = 0;
		int length2 = 0;
		
		System.out.println( "Enter a string or -1 to quit: " );
		string1 = sc.nextLine();
		
		if (!string1.equals(check)) {
			System.out.println( "Enter another string or -1 to quit: " );
			string2 = sc.nextLine();
		}
		
		equal = string1.equals( string2 );
		if ( equal == true ) {
			System.out.println( "String1 and string2 are the same. " );
		}
		else {
			System.out.println( "String1 and string2 are NOT the same. " );
		}
		
		compare = string1.compareTo( string2 );
		
		if ( compare == 0 ) {
			System.out.println( "These two strings are equal. ");
		} 
		else if ( compare > 0 ) {
			System.out.println( "These two strings are NOT in alphabetical order. " );
		} 
		else {
			System.out.println( "These two strings are in alphabetical order. " );
		}
		
		length1 = string1.length();
		length2 = string2.length();
		
		if ( length1 > length2 ) {
			System.out.println( "String1 is longer that string2. " );
		} 
		else if ( length1 == length2) {
			System.out.println( "The lengths of the two strings are the same." );
		}
		
		System.out.println( "The length of string1 is " + length1 );
		System.out.println( "The length of string2 is " + length2 );
		
		
    } // end method main
} // end public class