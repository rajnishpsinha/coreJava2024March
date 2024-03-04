package time;

import java.time.ZoneId;
import java.util.Set;

/*this gets list of all zone id in java8 time package*/
public class Listofzoneid {
	public static void main (String[]args){
	Set<String> zoneidset =ZoneId.getAvailableZoneIds();
	zoneidset.stream().forEach(p -> System.out.println(p));
	}
}
