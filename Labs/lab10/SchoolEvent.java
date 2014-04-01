/** 
* Lab 10
* Shyla Clark
* Apr 1
*/

import java.util.*;

public class SchoolEvent extends Event {
	private String courseName;
	
	public SchoolEvent( String name, String location, String date, String courseName ) {
		super ( name, location, date );
		this.courseName = courseName;
	} // end method public SchoolEvent
	
	public String getcourseName() {
		return courseName;
	} // end public GetName
	
	public String toString() {
		return "This is name: " + super.eventName + " This is location: " + super.eventLocation + " This is date: " + super.eventDate + " This is course: " + courseName;
	} // end toString
} // end public class SchoolEvent