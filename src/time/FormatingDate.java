package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatingDate {

	public static void main(String[]args){
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm") ;
		String date = "2024-01-03 15:20";
		LocalDateTime dateTime= LocalDateTime.parse(date, formatter);
	//s	dateTime.toInstant(ZoneId.of("Asia/Calcutta")).toEpochMilli();
		System.out.println("dateTime: "+dateTime);
	}
}
