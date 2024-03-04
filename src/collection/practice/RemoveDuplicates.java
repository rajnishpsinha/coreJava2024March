package collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static List removeDuplicateEmployees(List list){
	
		Set hashSet = new LinkedHashSet(list); 
	  List modifedList = new ArrayList(hashSet);
	  
		
		return modifedList;
		
	}
	
 public static void main(String[]args){
	 List<Employee> list = new ArrayList<Employee>();
	 list.add(new Employee(25,"Ramesh",80000)) ;
	 list.add(new Employee(45,"Ajay",35000));
	 list.add(new Employee(40,"Sanjay",35000));
	 list.add(new Employee(40,"Sanjay",35000));
	
	 System.out.println(removeDuplicateEmployees(list));
	 
 }

}
