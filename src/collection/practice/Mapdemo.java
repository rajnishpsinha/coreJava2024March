package collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
hm.put(1, new Employee(25,"Prabhu",40000));
hm.put(2, new Employee(48,"Krishna",85000));
hm.put(3, new Employee(51,"Raju Shrivastava",140000));
hm.put(4, new Employee(32,"Abhijit",48000));
hm.put(null, new Employee(31,"Harith",42000));
hm.put(5,null);
hm.put(6,null);
Set<Entry<Integer, Employee>> entryset= hm.entrySet();
Iterator<Entry<Integer, Employee>> itr = entryset.iterator();
while (itr.hasNext())
{
Entry<Integer, Employee> e= itr.next();
	System.out.println(e.getKey()+" : "+e.getValue());
}
System.out.println(hm.get(2));
	}

}
