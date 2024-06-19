package leetcode;

public class RemoveElement {
public int removeElement(int[] nums, int val) {
	
	int i = 0;

    for ( int num : nums)    	
      if (num != val)
        nums[i++] = num;
    return i;
  }
public static void main(String[]args){
	int[] nums={0,1,2,2,3,0,4,2};
	RemoveElement removeElement = new RemoveElement();
	int result =removeElement.removeElement(nums, 2);
	System.out.println("result is: "+result);
}
      
} 
	
	
  


