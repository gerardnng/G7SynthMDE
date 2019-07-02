package G7MM2Arduino.main;

import java.sql.Timestamp;

public class GenerationSupport {
	public static String getCurrentTime(){
	    java.util.Date date = new java.util.Date();
	    Timestamp ts = new Timestamp(date.getTime());
	    return ts.toString();
	}
}
