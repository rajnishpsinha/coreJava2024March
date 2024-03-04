package exception.practice;

public class Customageexception extends Exception {
	private static final long serialVersionUID = 1L;

public Customageexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

public static  boolean varifyAge(int age) throws Customageexception
{
if (age<18)
{
throw new Customageexception("age is less than 18 years exception");	
}
else return true;
}

}
