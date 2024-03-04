package leetcode;

/*Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x*/

public class PowerOfFour {
	public static boolean isPowerOfFour(int n) {
		if (n >4) {
			double d = n;			
			if (d == Math.pow(4, (Math.log(n) / Math.log(4)))) {
				return true;
			}
			if(n==1)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(17));

	}
}
