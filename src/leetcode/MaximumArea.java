package leetcode;


public class MaximumArea {
	public int maxArea(int[] height) {
		/*basic way time complexity O(n2)*/
		Integer maxArea = 0;
		int arrayLength = height.length;

		for (int i = 0; i < arrayLength; i++) {
			if (i==0 ||  height[i] > height[i-1]) {
				for (int j = arrayLength - 1; j > i; j--) {
					if ((j == arrayLength - 1) || (height[j] > height[j + 1])) {

						int width = j - i;
						int length = height[i] > height[j] ? height[j] : height[i];
						int area = width * length;
						maxArea= maxArea < area ?area:maxArea ;
					}
				}
			}
		}
		return maxArea;
	}
	
	public int maximumArea(int[] height){
		/*time complexity O(n)*/
		
		int i=0;
		int j= height.length-1;
		Integer maxArea = 0;
		do{
			int width = j-i;		
			int length = height[i] > height[j] ? height[j] : height[i];	
		
			int area = width * length;
			maxArea= maxArea < area ?area:maxArea ;
			if(height[i] > height[j]){ 
				j--;
			}
			else i++;
		}
		while(i<j);
		return maxArea;
		
	}
	 
	 public static void main(String[]args){
		 MaximumArea maximumArea = new MaximumArea();
		 
		 int[] height = {1,8,6,2,5,4,8,3,7};
		 int[] height1 = {1,1};
		 int[] height2 = {1,2,4,3};
		 
	//	System.out.println(maximumArea.maxArea(height2)); 
		 System.out.println(maximumArea.maximumArea(height2));
	 }

}

/*11. Container With Most Water
Medium

20799

1103

Add to List

Share
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
*/
