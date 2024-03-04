package leetcode;

import java.util.HashMap;

public class LetterCombinations {
	public String[] getLatterCombinations(String input){
		
		String[]numbers = {"2","3","4","5","6","7","8","9"};
		String[] alpabets= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		HashMap<String,String> hashMap =new HashMap<String, String>();
		for (int i=0;i<numbers.length;i++){
			hashMap.put(numbers[i],alpabets[i]);
		}
		int i=0;
		
		while(i<input.length()){
			
			String values= hashMap.get(String.valueOf(input.charAt(i)));
		}
		
		
		return null;
	}

}
