package general;

import java.util.Scanner;

public class Recursivefactorial {
public static int factorial(int n)
{
if (n==1) return 1;
else return factorial(n-1)*n;
	
}
public static void main (String[]args)
{
System.out.println("Ente the integer ");
int num=0;
Scanner scan = new Scanner(System.in);
 num= scan.nextInt();

System.out.println(Recursivefactorial.factorial(num));

}
}
