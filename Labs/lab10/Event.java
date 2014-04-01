/** 
* Lab 10
* Shyla Clark
* Apr 1
*/

import java.util.*;

public class Event {
	protected String eventName;
	protected String eventLocation;
	protected String eventDate;
	
	public Event( String name, String location, String date ) {
		this.eventName = name;
		this.eventLocation = location;
		this.eventDate = date;
	} // end public Event
	
	public String getName() {
		return this.eventName;
	} // end public GetName
	
	public String getLocation() {
		return this.eventLocation;
	} // end public getLocation
	
	public String getDate() {
		return this.eventDate;
	} // end public getDate
	
} // end public class Event