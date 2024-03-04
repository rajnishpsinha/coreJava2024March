package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Hospital
{
	private String disease;
	private String name;
	private int age;

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Patient {

public static void main (String[]args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
/*Get the object of which property has to be checked*/
Hospital hosp = new Hospital();
Class cls= hosp.getClass(); // Got the class name in runtime
System.out.println("Class name is : "+cls.getName());
//System.out.println("Constructor is: "+cls.getConstructor().getName());
//cls.getConstructor(parameterTypes)
Method[] methods= cls.getMethods();
for (Method m:methods)
{
	System.out.println(m);
}
/*invoking method at runtime, first make object of desired method and then invoke*/
Method methodobj1=cls.getDeclaredMethod("setAge", int.class);
methodobj1.invoke(hosp, 45);
System.out.println("Age is: "+ hosp.getAge());
}

}
