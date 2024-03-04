package general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Propertiespractice {
	public  void printPropertiesValues()
	{
		Properties prop = new Properties();			
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test.properties");
		if (inputStream==null){
			throw new IllegalArgumentException("  is not found");
		}
		try {
			prop.load(inputStream);
			System.out.println("load");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		// print all properties
       for (Entry entry: prop.entrySet())       {
    	   System.out.println(entry.getKey()+ " : "+entry.getValue());
       }
		
	}
	public static boolean authenticateFromPropertiesfile()
	{
		Properties prop = new Properties();
		String path= System.getProperty("user.dir");
		try {
			InputStream input = new FileInputStream(path+ "/src/resources/config.properties");
			 prop.load(input);
			Set<String> propSet =prop.stringPropertyNames();
			Iterator<String> iterator = propSet.iterator();
			 
			while (iterator.hasNext()) {
			    String name = iterator.next();
			    System.out.println("from set: "+name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String user =prop.getProperty("name");
		String pass = prop.getProperty("password");
		if (user.equals("amit") && pass.equals("jio123"))
		return true;
		else return false;
	}
public static void main (String[]args)
{
	System.out.println(authenticateFromPropertiesfile());
	Propertiespractice propertiespractice= new Propertiespractice();
	propertiespractice.printPropertiesValues();
	
}
}
