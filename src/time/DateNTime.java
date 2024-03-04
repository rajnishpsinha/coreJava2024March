package time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateNTime {
	public static void main (String[]args)
	{
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(OffsetDateTime.now());
		OffsetDateTime time=OffsetDateTime.parse("2021-04-06T09:57:56.024+02:00");
		System.out.println(time.toOffsetTime());
		
		System.out.println(time.toLocalDateTime());
		System.out.println(time);

	}

}
