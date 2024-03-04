package stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Person
{
private String name;
private int age;
public Person(String name, int age )
{
	this.name= name;
	this.age=age;
	}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
}

public class Filteroutfromstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Person> employee = new ArrayList<Person>();
employee.add(new Person("Ajit",41));
employee.add(new Person("Prasson",32));
employee.add(new Person("Rehman",28));
employee.add(new Person("Sundar",26));
employee.add(new Person("Geogge",52));
 employee.stream().filter(p ->p.getAge()>40).forEach(p->System.out.println(p.getName()+" : "+p.getAge()));


	}

}
