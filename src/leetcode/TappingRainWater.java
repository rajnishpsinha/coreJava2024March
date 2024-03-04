package leetcode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TappingRainWater {
	public int trap(int[] height) {
		
		int totalWater = 0;
		int[] leftArray = new int[height.length];
		int[] rightArray = new int[height.length];

	
		rightArray[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--)
        	rightArray[i] = (rightArray[i + 1]> height[i])?rightArray[i + 1]:height[i];
		
		
		leftArray[0] = height[0];
        for (int i = 1; i < height.length; i++)
        	leftArray[i] = (leftArray[i - 1]> height[i])?leftArray[i - 1]:height[i];        
		

		for (int k = 0; k < height.length; k++) {
			int smallOfLeftAndRightArray = (leftArray[k] < rightArray[k]) ? leftArray[k] : rightArray[k];
			totalWater = totalWater + (smallOfLeftAndRightArray - height[k]);
		}
		return totalWater;

	}

	public static void main(String[] args) {
		TappingRainWater tappingRainWater = new TappingRainWater();
		int[] height1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		// int[] height2 = {4,2,0,3,2,5};
		// int[]height3 ={0,1,0,2,1,0,1,3,2,1,2,1};
		// IntStream.of(height1).forEach(p-> System.out.print(p+" "));
		// System.out.println("");
		int result1 = tappingRainWater.trap(height1);
		// int result2=tappingRainWater.trap(height2);
		// int result3=tappingRainWater.trap(height3);

		// System.out.println(result1);
		// System.out.println(result2);
		// System.out.println(result3);

	}

}
