/*You are given an integer array nums. You are initially positioned at the array's
 *  first index,  *  and each element in the array represents your maximum jump length
 *   at that position.
Return true if you can reach the last index, or false otherwise.*/

package leetcode;

public class JumpGame {

	public boolean canJump(int[] nums) {
		if ( nums.length==1 )
			return true;
		if (nums[0] == 0 )
			return false;
		Boolean foundZero = false;
		Integer lengthFromZero = 0;
		Integer positionOfZero= -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0 && foundZero == false) {
				foundZero = true;
				positionOfZero=i;
				
			}

			if (foundZero == true ) {
				if (nums[i] > lengthFromZero){
					lengthFromZero=0;
					foundZero=false;
					
					}
				else if(nums[i] == lengthFromZero && positionOfZero== nums.length-1){
					lengthFromZero=0;
					foundZero=false;
				}
				
				else {
					lengthFromZero = lengthFromZero + 1;
				}

			}
			if (foundZero == false && i==0 )
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		JumpGame jumpGame = new JumpGame();
		int[] test1 = { 2, 3, 1, 1, 4 };
		int[] test2 = { 1,0,5,3, 2, 1, 0, 4 };
		int[] test3 = { 3, 2, 1, 0, 4 };
		int[] test4 ={0};
		int[] test5 ={2,0};
		int[] test6={2,0,0};
		System.out.println("true: "+jumpGame.canJump(test1));
		System.out.println("false: "+jumpGame.canJump(test2));
		System.out.println("false: "+jumpGame.canJump(test3));
		System.out.println("true: "+jumpGame.canJump(test4));
		System.out.println("true: "+jumpGame.canJump(test5));
		System.out.println("true: "+jumpGame.canJump(test6));

		

	}
}
