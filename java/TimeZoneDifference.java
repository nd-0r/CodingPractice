/*

You're given a string cityA and the related string 
timestamp (time in cityA) with the date formatted 
in full U.S. notation, as in this example:

"July 21, 1983 23:01"

You have to return a new timestamp with date and 
corresponding time in cityB, formatted as in this 
example:

"1983-7-22 23:01"

*/
import java.util.*;
import java.util.HashMap;
import java.util.Date;


public class TimeZoneDifference {

    static Map<String, Double> zones = new HashMap<String, Double>();
    static Map<String, Integer> months = new HashMap<String, Integer>();
    static Map<
    

    public static String timeDifference(String cityA, String timestamp, String cityB) {
        
        int hours;
        int minutes;

        zones.put("Los Angeles", -8.0);
        zones.put("New York", -5.0);
        zones.put("Caracas", -4.5);
        zones.put("Buenos Aires", -3.0);
        zones.put("London", 0.0);
        zones.put("Rome", 1.0);
        zones.put("Moscow", 3.0);
        zones.put("Tehran", 3.5);
        zones.put("New Delhi", 5.3);
        zones.put("Beijing", 8.0);
        zones.put("Canberra", 10.0);
        



	}

}