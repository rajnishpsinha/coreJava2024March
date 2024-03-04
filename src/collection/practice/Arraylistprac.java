package collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistprac {
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> al1)
	{	
		ArrayList<Integer> al2= new ArrayList<Integer>();
		Iterator<Integer> itr= al1.iterator();
		while(itr.hasNext())
		{
			Integer i= itr.next();
			if (!(al2.contains(i)))
			al2.add(i);
		}
		return al2;		
	}
	public static ArrayList<Employee> removeDuplicateEmployees(ArrayList<Employee> al1)
	{	
		ArrayList<Employee> al2= new ArrayList<Employee>();
		Iterator<Employee> itr= al1.iterator();
		while(itr.hasNext())
		{
		Employee emp= itr.next();
			if (!(al2.contains(emp)))
			al2.add(emp);
		}
		return al2;		
	}
	public static ArrayList<Student> removeDuplicateStudents(ArrayList<Student> al3)
	{	
		ArrayList<Student> al4= new ArrayList<Student>();
		Iterator<Student> itr= al3.iterator();
		while(itr.hasNext())
		{
		Student st= itr.next();
			if (!(al4.contains(st)))
			al4.add(st);
		}
		return al4;		
	}
	public static void main (String[]args)
	{
		/*
		 * ArrayList<Integer>al1= new ArrayList<Integer>();
		al1.add(15); al1.add(17); al1.add(15); al1.add(20); al1.add(17);al1.add(21);
		ArrayList<Integer> al2=Arraylistprac.removeDuplicates(al1);
		System.out.println(al1);
		System.out.println(al2);
		*/
		
	ArrayList <Employee> al1= new ArrayList<Employee>();
	Employee emp1= new Employee(47,"Suresh Krishna",54000);
	Employee emp2= new Employee(21,"Amit Pawar",24000);
	Employee emp3= new Employee(47,"Suresh Krishna",54000);
	Employee emp4= new Employee(39,"Rajesh Parikar",72500);
	al1.add(emp1); al1.add(emp2); al1.add(emp3); al1.add(emp4);
	ArrayList<Employee>al2=Arraylistprac.removeDuplicateEmployees(al1);
	System.out.println(al1);
	System.out.println(al2);
	
	ArrayList<Student> al3= new ArrayList<Student>();
	Student st1= new Student("Amit",20L,30.34);
	Student st2= new Student("Rajesh",27L,25.65);
	Student st3= new Student("Rajesh",27L,25.65);
	al3.add(st1); al3.add(st2); al3.add(st3);
	ArrayList<Student> al4=Arraylistprac.removeDuplicateStudents(al3);
	System.out.println(al3);
	System.out.println(al4);
	
	}

}
