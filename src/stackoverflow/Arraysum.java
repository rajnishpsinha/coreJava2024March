package stackoverflow;

import java.util.stream.IntStream;

public class Arraysum {
	public static int sum13(int[] nums) {
        int sum = 0;
        for(int i=0; i < nums.length; i++) {
            
            if(nums[i] == 13) {
                break;
            }
             sum += nums[i];
        }
         return sum;
     }
	/*public static int sum130(int[] nums) {
	    return IntStream.of(nums).takeWhile(int i -> i != 13).sum();
	}*/
   public static void main(String[] args) {
         //this is the main method
         int[] a = {1,2,3,13,4};
         
         System.out.println(sum13(a));
         

 }
   
}
