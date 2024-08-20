package arraypractice;
//reverse array without using extra space
public class ReverseArray {
	
	protected int[] reverseArray(int[] nums){
		int temp=0;
		for(int i=0; i<=nums.length/2; i++){
			temp= nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;			
			}		
		return nums;	
		
	}
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] nums=new int[]{4,7,3,8,7,0};
		int[] output= reverseArray.reverseArray(nums);
		
		for(int k:output){
			System.out.print(k+" ");
		}
	}

}
