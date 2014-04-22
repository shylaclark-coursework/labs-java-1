/** 
* Lab 11
* Shyla Clark
* Apr 8
*/

import java.util.*;

public class SocialEvent extends GeneralEvent {
	private boolean byob;
	
	public SocialEvent( String name, String location, String date, boolean byob ) {
		super ( name, location, date );
		this.byob = byob;
	} // end method public SocialEvent
	
	public boolean returnBYOB() {
		return this.byob;
	} // end public returnBYOB
	
	public String toString() {
		return " BYOB is: " + this.byob;
	} // end toString
	
} // end public class SocialEvent