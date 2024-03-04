package leetcode;

public class Palindromenumber {
	static boolean isPalindrome(int x) {
		int reversedNumber=0;
		int numberOfDigits = 1;
		int divisor = 1;
		for (int i = 0; i < 100; i++) {
			divisor = divisor * 10;
			int remainder = x % divisor;
			if (remainder == x)
				break;
			else	numberOfDigits++;
			
		}
		int  n=0;
		for (int j=numberOfDigits-1;j>=0;j--){
			int divisor2=(int) Math.pow(10, j);
			reversedNumber+= (x%divisor2)* (int)Math.pow(10, n++);			
		}
		System.out.println("numberOfDigits: "+ numberOfDigits);
		return false;
	}
 public static void main (String[]args){
	 isPalindrome(4675887);
 }
}
