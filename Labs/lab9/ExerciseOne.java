/** 
* Exercise One
* Lab 9
* Shyla Clark
* Mar 25
**/

import java.util.*;

public class DynamicArray {
	private int length;
	private String[] array;
	private int index;
	
// CONSTRUCTORS --------------------------------
	
	public DynamicArray() { 
		length = 10;
		index = 0;
	}
	
	public DynamicArray ( int length ) { 
		this.length = length;
		index = 0;
	}
	
	public DynamicArray ( String[] array ) { 
		this.array = Arrays.copyOf( String[] array, array.length() );	
	}

// CONSTRUCTORS END ------------------------------

// METHODS ---------------------------------------
	
	// add method 1
	public static void addValue ( String entry ) {
		if ( index < array.length() ) {
			array[i] = entry;
		} else {
			expandArray( array );
			this.length = array.length();
			array[i] = entry;
			index++;
		}
	} // end addValue method
	
	public static void expandArray ( String[] array ) {
		this.array = Arrays.copyOf( String[] array, ( int )( 1.5 * array.length() ) );
	} // end expandArray method
	
	// add method 2
	public static void addValue ( String entry, int index) {
		if ( index > array.length ) {
			System.out.println( "Error.");
		} else {
			array[index] = entry;
		}
	} // end addValue method
	
	public static void removeValue ( int index ) {
		String[] tempArray = new String[ array.length() -1 ];
		for ( int i = 0; i < array.length; i++ ) {
			if ( i < index ) {
				tempArray[ i ] = array[ i ];
			} else {
				tempArray[ i ] = array[ i + 1 ];
			}
		}
		array = tempArray;
		this.length = tempArray.length;
		this.index--;
	} // end removeValue method
	
	public static String get ( int index ) {
		return array[ index ];
	} // end get method
	
	public static boolean isEmpty ( String [] array ) {
		boolean isEmpty;
		if ( array.length() = 0 ) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	} // end isEmpty method
	
	 // return current value of length
	public static int sizeOf ( ) {
		return length;
	}
	
// METHODS END -----------------------------------

} 

