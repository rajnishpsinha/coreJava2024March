package stringpractice;

import java.util.Scanner;

/*this is a program that compresses the string, for example if we have
AaacDkjkk, it will make it A3CDKJK2
*/
public class Compress {
String takeInputFromUser()
{
System.out.println("Enter the string");
String output=null;
Scanner scan = new Scanner(System.in);
while (scan.hasNext())
{
 output = scan.next();
System.out.println("output is: "+output);
}
return output;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Compress cmp = new Compress();
cmp.takeInputFromUser();
	}

}
