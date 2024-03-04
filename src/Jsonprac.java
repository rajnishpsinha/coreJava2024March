import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;


@Data
public class Jsonprac {
	String name;
	Date date;
	String date1;
	
	public Jsonprac(String name, Date date, String date1) {
		super();
		this.name = name;
		this.date = date;
		this.date1=date1;
	}
	
	public static void main (String[]args)
	{
		GsonBuilder builder = new GsonBuilder(); 
	      builder.setPrettyPrinting(); 
	      
	      Gson gson = builder.create();
	      
	      Jsonprac obj = new Jsonprac("Amit",Calendar.getInstance ().getTime (), OffsetDateTime.now().toString());
	     String str= gson.toJson(obj);
	     System.out.println(str);
	    // System.out.println(OffsetDateTime.now().toString());
	}
	

}
