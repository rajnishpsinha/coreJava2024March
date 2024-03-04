package collection.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

public class Reversecharacter {
public static void main (String[]args)
{
	Stack stack = new Stack<Character>();
	try {
		InputStream io = new FileInputStream ("E:\\Java_programs\\Testing.txt");
		int content;
     while ((content=io.read())!=-1)
     {
    	// System.out.println((char)content);
    	 stack.push((char)content);
    	 
     }
     
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while (!stack.isEmpty())
	{
		System.out.print((char)stack.pop());
	}
}
}
