package leetcode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortColors {
	
public static void sortColorsArray(int[] nums) {
	int pos= 1;
	while(pos<nums.length){
		int temPos=pos;
		while(nums[temPos]<nums[temPos-1]){
			int temp = nums[temPos];
			nums[temPos]= nums[temPos-1];
			nums[temPos-1]=temp;
			if (temPos>1)temPos--;
		}
		pos++;
	}
	
        
    }
public static void main (String[]args){
	int[] nums1 = {2,0,2,1,1,0};			
	int[] nums2 = {2,0,1};
	SortColors.sortColorsArray(nums1);
	IntStream.of(nums1).forEach(el->System.out.println(el));
	
}

}
