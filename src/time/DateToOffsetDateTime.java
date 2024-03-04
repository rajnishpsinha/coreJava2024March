package time;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateToOffsetDateTime {
	public static void main(String[]args)
	{
		Date date = new Date();	
		// adding offset to time	
/*				int hour = 5;
				int minute = 30;
				OffsetDateTime offsetDateTime = date.toInstant()
				  .atOffset(ZoneOffset.ofHoursMinutes(hour, minute));*/
		
	//	OffsetDateTime offsetDateTime1 = OffsetDateTime
	//																		.ofInstant(date.toInstant(), ZoneId.of("Asia/Kolkata"));
		System.out.println("1. Date: "+ date);	
		/*System.out.println("2. OffsetDateTime: "+offsetDateTime);
		System.out.println("3. String Offset Format: "+offsetDateTime.toString());
		System.out.println("4. String Offset Format: "+offsetDateTime1.toString());
*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ENGLISH);

		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		//	sdf.setTimeZone(TimeZone.getTimeZone("GMT"));           
		System.out.println(sdf.format(date));	
		String str = sdf.format(date);
		System.out.println("String: "+str );
		

        // In JVM's timezone and default format as returned by Date#toString
        System.out.println(date);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        System.out.println("2nd formatter: "+sdf1.format(date));
  
	}

}
