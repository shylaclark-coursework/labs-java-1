/** 
* Exercise One
* Lab 5
* Feb 25
**/

import java.util.Scanner; // create and initialize scanner

public class ExerciseOne {
	
    public static void main( String[] args ) {
		   
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Please input 1 for Fahrenheit to Celsius, 2 for Celsius to Fahrenheit and 3 to quit.");
			int choice = input.nextInt();

		if ( choice == 1 ) {
			System.out.println( "What number do you want to convert to Celsius?" );
			float t = input.nextFloat();
			float output = fToC( t );
			System.out.println( output );
		} // end choice 1
		
		if ( choice == 2 ) {
			System.out.println( "What number do you want to convert to Fahrenheit?" );
			float t = input.nextFloat();
			float output = cToF( t );
			System.out.println(cToF( output ));
		} // end choice 2
		
	} // end method main
	
	public static float fToC( float t ) {
		float celsius = (( t - 32 ) * ( 5.0f / 9.0f ));
		return celsius;
	} // end method fToC
	
	public static float cToF( float t ) {
		float fahrenheit = ( t * ( 9.0f / 5.0f ) + 32);
		return fahrenheit;
	} // end method cToF
	
} // end public class
