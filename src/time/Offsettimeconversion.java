package time;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/*converting  offset date and time to other offset time*/
public class Offsettimeconversion {
	public static void main (String[]args){
	OffsetDateTime offsetdate = OffsetDateTime.parse("2021-04-06T09:57:56.024+02:00");
// below are two mwthods, one taking ZoneId from defined string and other from offset
ZonedDateTime  zoneddatetime1 =  offsetdate.atZoneSameInstant(ZoneId.of("Asia/Calcutta"));
ZonedDateTime  zoneddatetime2 =  offsetdate.atZoneSameInstant(ZoneId.ofOffset("UTC", ZoneOffset.ofHoursMinutes(05, 30)));

System.out.println("Offsetdatetime converted to other zone:  "+zoneddatetime1);
System.out.println("Offsetdatetime converted to other zone:  "+zoneddatetime2);

	}
}
