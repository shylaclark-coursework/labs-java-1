/** 
* Exercise One
* Lab 5
* Feb 25
**/

import java.util.Scanner; // create and initialize scanner

public class ExerciseOne {

    public static void main( String[] args ) {
		
        Scanner input = new Scanner(System.in);
		
		
		System.out.println( "Please input 1 for fahrenheit to celsius, 2 for celsius to fahrenheit and 3 to quit.");
			int choice = input.nextInt();
		
		if ( choice == 1 ) {
			System.out.println( "What number do you want to convert to Celsius?" );
			float number = input.nextFloat();
			float output = fToC( input );
			System.out.println( output );
		} // end choice 1
		
		if ( choice == 2 ) {
			System.out.println( "What number do you want to convert to Celsius?" );
			float number = input.nextFloat();
			float output = cToF( input );
			System.out.println(cToF( output ));
		} // end choice 2
		
	} // end main

	public static float fToC( float t) {
		float celsius = (( t - 32 ) * (5/9));
		return celsius;
	}
	
	public static float cToF( float t) {
		float fahrenheit = (( t + 32 ) * (9/5));
		return fahrenheit;
	}
} // end public class
