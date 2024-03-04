package arraypractice;
/*program to  find duplicate String value in array*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {
 public static  void printDuplicates(String[] arr)
 {
	 HashMap<String,Integer> hm = new HashMap<String,Integer>();
	 for (int i=0; i<arr.length; i++)
	 {
		
		if (hm.containsKey(arr[i]))
		{
			int count = hm.get(arr[i]);
			++count;
			hm.put(arr[i], count);
		}
		else
		{ hm.put( arr[i],1);}
	
	 }
 Set set= hm.entrySet();
 Iterator itr= set.iterator();
 while (itr.hasNext())
 {
	 Entry<String, Integer> entry=(Entry<String, Integer>) itr.next();	
	 System.out.println( entry.getKey()+": "+entry.getValue());
 }
 
 }
public static void main (String[]args)
{
	String[] names= new String[5];
	names[0]="Krishna";
	names[1]="Ajit";
	names[2]="Ram";
	names[3]="Krishna";
	names[4]="Ram";

	printDuplicates(names);
}
}
