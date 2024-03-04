package collection.practice;

public class Employee {
private int age;
private String name;
private int salary;
public int getAge() {
	return age;
}
@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
}
public Employee(int age, String name, int salary) {
	super();
	this.age = age;
	this.name = name;
	this.salary = salary;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Employee)) {
		return false;
	}
	Employee other = (Employee) obj;
	if (age != other.age) {
		return false;
	}
	if (name == null) {
		if (other.name != null) {
			return false;
		}
	} else if (!name.equals(other.name)) {
		return false;
	}
	if (salary != other.salary) {
		return false;
	}
	return true;
}

}
