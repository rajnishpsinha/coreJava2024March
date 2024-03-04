package exception.practice;

import java.util.Scanner;

public class Ticketbooking {

	public String bookTicket()
{
	String message="failure";
	System.out.println("Enter the age: ");
		Scanner scan = new Scanner(System.in);
		int age =scan.nextInt();
		try {
			if (Customageexception.varifyAge(age)==true)
			{
				System.out.println("proceed for ticket booking, age is OK");
				message="sucess";
			}
		} catch (Customageexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Try again");
		}

	
	return message;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ticketbooking tb= new Ticketbooking();
tb.bookTicket();
	}

}
