package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		int minLength = strs[0].length();
		boolean hasEmptyString = false;
		for (String str : strs) {
			if (str.isEmpty()) {
				hasEmptyString = true;
				break;
			}
			if (str.length() < minLength)
				minLength = str.length();
		}
		if (hasEmptyString)
			return "";
		if (strs.length == 1)
			return strs[0];
		if(strs[0].charAt(0)!=strs[1].charAt(0))return "";
		boolean match = true;
		char toMatch = 0;
		int k = 0;
		int i = 0;
		while (match && k < minLength) {
			if (k+1 == minLength)
				break;
			k++;	
			
		
			toMatch = strs[0].charAt(k);
			for (i = 0; i < strs.length; i++) {
				if (strs[i].length() == 0)
					break;
				if (toMatch != strs[i].charAt(k)) {
					match = false;  
					break;
				}
			}
			
		}
		if (k > 0)
			return strs[0].substring(0, k);
		else
			return "";
	}

	public String longestCommonPrefix1(String[] strs) {
	
		Arrays.sort( strs,(s1,s2)->{
			 return s1.compareTo(s2);});	
		
		if (strs[0].length()==0) return "";
		StringBuilder stringBuilder = new StringBuilder();
		int arrLength= strs.length;
		for(int i=0;i<strs[0].length();i++){
		if(	strs[arrLength-1].length()<=i) break;
			if (strs[0].charAt(i)==strs[arrLength-1].charAt(i))stringBuilder.append(strs[0].charAt(i));
			else break;
		}		
     //	System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
		
	}
	static public  void main(String[] args) {
	//	String[] strs = { "flower", "flow", "flight" };
	//	 String[] strs = {"flower","fxdh","fkjk"};
		// String[] strs = {"",""};
		 String[]strs= {"ab", "a"};
	//	 String[]strs={""};
	//String[]strs= {"dog","racecar","car"};

		LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
	//	String output = commonPrefix.longestCommonPrefix(strs);
	//	System.out.println(output);
	
		commonPrefix.longestCommonPrefix1(strs);
	}
	

}
