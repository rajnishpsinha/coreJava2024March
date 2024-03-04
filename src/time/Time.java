package time;

import java.time.LocalTime;

public class Time {
public static void main (String[]args)
{
LocalTime time= LocalTime.now();
int hour= time.getHour();
int minute= time.getMinute();
int second=time.getSecond();
System.out.println("Hour-minute-second"+hour+": "+minute+": "+second);

}
}
