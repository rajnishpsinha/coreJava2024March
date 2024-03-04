package functionalprogramming;

public class Lamdaexpressions {
	public static void main (String[]args)
	{
Addnumbers addnumber = (int a, int b)->a+b;
//addnumber.addNumber(3,4);
System.out.println(addnumber.addNumber(3,4));

// method with generics
PrintInput<Integer> PrintInput= (String st) -> {return 10;};


}}
