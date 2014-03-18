/** 
* Exercise One
* Lab 8
* Shyla Clark
* Mar 18
**/

import java.util.*;

public class ExerciseOne {
	
	public static int Menu() { 
		
		Scanner sc = new Scanner( System.in );
		
		System.out.println( "Choose 1 to add" );
		System.out.println( "Choose 2 to subtract" );
		System.out.println( "Choose 3 to multiply" );
		System.out.println( "Choose 4 to divide" );
		System.out.println( "Choose 5 to quit ");
				
		int input = sc.nextInt();
		return input;
		
	} // end int menu
    
	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		Fraction f0 = new Fraction( 0, 1 );
		int choice = 0;
		
	do {
		System.out.println( "Please enter first numerator");
		int num = input.nextInt();
		
		System.out.println( "Please enter first denominator");
		int den = input.nextInt();
		
		Fraction f1 = new Fraction( num, den );
		
		System.out.println( "Please enter second numerator");
		num = input.nextInt();
		
		System.out.println( "Please enter second denominator");
		den = input.nextInt();
		
		Fraction f2 = new Fraction( num, den );
		
		choice = Menu();
		
		if ( choice == 1 ) { 
			f0 = f1.add( f2 );
			System.out.println( f0.toString() );
		}
		else if ( choice == 2 ) { 
			f0 = f1.subtract( f2 );
			System.out.println( f0.toString() );
		}
		else if ( choice == 3 ) { 
			f0 = f1.multiply( f2 );
			System.out.println( f0.toString() );
		}
		else if ( choice == 4 ) { 
			f0 = f1.divide( f2 );
			System.out.println( f0.toString() );
		}
		else if ( choice != 5 ) {
			System.out.println( "Error" );
		}
	} while ( choice !=5 );

    } // end method main
} // end public class