/** 
* Lab 11
* Shyla Clark
* Apr 8
*/

import java.util.*;

public class EventTest {
	
	public static void main( String[] args ) {
		
		SchoolEvent homeworkNight = new SchoolEvent( "Homework Night", "UNO", "April 4", "1583" );
			
		SchoolEvent homeworkNight2 = new SchoolEvent( "Homework Night", "UNO", "April 11", "1583" );
		
		SchoolEvent homeworkNight3 = new SchoolEvent( "Homework Night", "UNO", "April 18", "1583" );
		
		SocialEvent midSwim = new SocialEvent( "Midnight Swim", "UNO", "April 19", true );
			
		SocialEvent boatTrip = new SocialEvent( "Boat Trip", "UNO", "April 20", true );
			
		ArrayList<Event> array = new ArrayList<Event>();
			array.add( homeworkNight);
			array.add( homeworkNight2);
			array.add( homeworkNight3);
			array.add( midSwim);
			array.add( boatTrip);
			
			int count = 0;
		
			while( count < 5) {
				System.out.println( array.get(count).toString());
				count++;
			} // end while
	
    } // end method main
} // end public class EventTest