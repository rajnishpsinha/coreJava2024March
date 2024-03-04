package stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

/* make an list of students and filter them based on subject*/
@Data
class Student{	
	private String name;
	private  byte  age;
	private String subject;
	public Student(String name, byte age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
}

public class Filterstudents {
	public static void main (String[]args){
	
	Student s1 = new Student("Ram", (byte)14, "Sceience")  ;
	Student s2 = new Student("Krishna", (byte)12, "Arts")  ;
	Student s3 = new Student("Vishnu", (byte)16, "Literature")  ;
	List<Student> arraylist = new ArrayList<Student>();
	arraylist.add(s1);
	arraylist.add(s2);
	arraylist.add(s3);
arraylist.stream().filter(stu -> stu.getAge()<15).forEach(stu -> System.out.println(stu.getName()));
	
	}

}
