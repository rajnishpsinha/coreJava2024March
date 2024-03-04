package collection.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Reversebyrcursion {
	public static  void reverseByRecursion(InputStream io, File file) throws IOException
	{
		int content;
		while((content=io.read())!=-1)
		{
			reverseByRecursion(io,file);
			System.out.print((char)content);
			
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File ("E:\\Java_programs\\Testing.txt") ;
		InputStream io = new FileInputStream(file);
		reverseByRecursion(io,file);
System.out.println("Testing git");
System.out.println("Testing git 2");
	}

	
	
	
	
	
}
