package time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaOffsetDateTimeConversion {

	public static void main(String[] args) {
	Date date = new Date();
	//Instant instant=date.toInstant();
//	System.out.println("Instant is: "+instant);
	LocalDateTime localDateTime = 
			  LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.of("Asia/Calcutta"));
		  System.out.println("Local date is: "+localDateTime);
		  ZoneOffset  zoneoffset=ZoneOffset.ofHoursMinutes(5, 30);
		  OffsetDateTime offsetdatetime= localDateTime.atOffset(zoneoffset);
		  System.out.println("offsetdatetime :"+offsetdatetime);
		  System.out.println("To string is: "+offsetdatetime.toString());
//	System.out.println(date);


	
	}

}
