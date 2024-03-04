package collection.practice;


public class Student {
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dues=" + dues + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((dues == null) ? 0 : dues.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (dues == null) {
			if (other.dues != null)
				return false;
		} else if (!dues.equals(other.dues))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Student(String name, Long age, Double dues) {
		super();
		this.name = name;
		this.age = age;
		this.dues = dues;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Double getDues() {
		return dues;
	}
	public void setDues(Double dues) {
		this.dues = dues;
	}
	Long age;
	Double dues;
	

}
