package collection.practice;

import java.util.HashMap;
import java.util.Map;

// Using hash map to count frequency of word in a sentence
public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "This is a test this is a test lalu";
String[] splitted = str.split(" ");
Map <String, Integer> hm = new HashMap<String, Integer>();
for (int i=0; i<splitted.length;i++)
{
if (hm.containsKey(splitted[i]))
{
int count = hm.get(splitted[i])	;
hm.put(splitted[i], count+1);
}
else {
	hm.put(splitted[i], 1);
}
}
System.out.println(hm);
	}

}
