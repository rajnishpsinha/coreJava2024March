package data.structure;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {
	
	public static void main (String[]args){
		int id= 100;
		int amount =51;
		boolean status = true;
		
		JSONObject  params = new JSONObject();
		 try {
		    params.put("vendor_id", 100);
		    params.put("amount", amount);
		    params.put("status", status);
		} catch (JSONException e) {
		    e.printStackTrace();
		    return;
		}
		 
		 System.out.println("params :");
		 System.out.println(params);
		  
		
	}
	
	
	
}
