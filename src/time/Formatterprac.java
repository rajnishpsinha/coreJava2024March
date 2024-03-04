package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Formatterprac {
public static void main (String[]args)
{
LocalDate 	localDate=  LocalDate.now();
DateTimeFormatter formatter= DateTimeFormatter.ofPattern("EEEE dd-MM-yy");
String text= localDate.format(formatter);
LocalDate date = LocalDate.parse(text, formatter);
DateTimeFormatter formatter1 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

System.out.println("text representation of localdate "+text);
System.out.println("localdate instance of localdate"+date);
System.out.println();


DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

String date2="24-9-2023";
LocalDateTime localDateTime = LocalDateTime.parse(date2);
System.out.println(formatter2.format(localDateTime));

String str = "1986-04-08";
DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.parse(str, formatter4);
System.out.println(formatter4.format(dateTime));
}  
}
