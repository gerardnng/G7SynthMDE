package G7MMToCode.main;

import java.sql.Timestamp;
import java.util.Date;

public class Informations {
	public static String getTime() {
		//return (new Date()).toString();
		java.util.Date date = new java.util.Date();
	    Timestamp ts = new Timestamp(date.getTime());
	    return ts.toString();
	}
}
