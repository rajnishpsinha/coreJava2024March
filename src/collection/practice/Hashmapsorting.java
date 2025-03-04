package collection.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



	class Salarycomparator implements Comparator<Entry<Integer,Employee>>{
		
	
		@Override
		public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
			// TODO Auto-generated method stub
			int sal1=o1.getValue().getSalary();
			int sal2= o2.getValue().getSalary();
			return sal1-sal2;
		}
		
	}


public class Hashmapsorting {

public static void  sortByKey(HashMap<Integer, Employee> hm)
{
	TreeMap tm= new TreeMap<Integer, Employee>();
  tm.putAll(hm);
  System.out.println("Sorted by key: ");
  System.out.print(tm);
}

public static void sortByValue(HashMap<Integer, Employee> hm)
{
	Set<Entry<Integer,Employee>> set= hm.entrySet();
	ArrayList<Entry<Integer, Employee>> list= new ArrayList<Entry<Integer,Employee>>();
  list.addAll(set);

Collections.sort(list, new Salarycomparator());	
LinkedHashMap lhm= new LinkedHashMap<Integer,Employee>();
for(Entry<Integer,Employee> entry: list)
{
Integer key=entry.getKey()	;
Employee emp= entry.getValue();
lhm.put(key, emp);
}
System.out.println(lhm);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Employee> hm1= new HashMap<Integer,Employee>();
hm1.put(2, new Employee (25,"Abhay", 24000));
hm1.put(1, new Employee (29,"Rajesh", 36000));
hm1.put(4, new Employee (35,"Jyothi", 45000));
hm1.put(3, new Employee (48,"Manish", 57000));
hm1.put(5, new Employee(21,"Rashid",15000));
//Hashmapsorting.sortByKey(hm1);
Hashmapsorting.sortByValue(hm1);


	}

}
