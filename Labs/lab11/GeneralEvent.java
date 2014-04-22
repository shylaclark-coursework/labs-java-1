/** 
* Lab 11
* Shyla Clark
* Apr 8
*/

import java.util.*;

public abstract class GeneralEvent implements Event { 
	protected String eventName;
	protected String eventLocation;
	protected String eventDate;
	
	public GeneralEvent( String name, String location, String date ) {
		this.eventName = name;
		this.eventLocation = location;
		this.eventDate = date;
	} // end public GeneralEvent
	
	public String getName() {
		return this.eventName;
	}
	public String getLocation() {
		return this.eventLocation;
	}
	public String getDate() {
		return this.eventDate;
	}
	public abstract String toString();
} // end public class Event