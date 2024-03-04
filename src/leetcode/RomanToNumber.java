package leetcode;

import java.util.HashMap;

public class RomanToNumber {	

	public int romanToInt(String s) {
	      s=s.toUpperCase();
	      char[] romanDigits = s.toCharArray();
	     HashMap hashMap= new HashMap<Character,Integer>();
	        hashMap.put(Character.valueOf('I'),Integer.valueOf(1));
	        hashMap.put(Character.valueOf('V'),Integer.valueOf(5));
	        hashMap.put(Character.valueOf('X'),Integer.valueOf(10));
	        hashMap.put(Character.valueOf('L'),Integer.valueOf(50));        
	        hashMap.put(Character.valueOf('C'),Integer.valueOf(100));
	        hashMap.put(Character.valueOf('D'),Integer.valueOf(500));
	        hashMap.put(Character.valueOf('M'),Integer.valueOf(1000));
	//        System.out.println(hashMap);
	        int sum=0;
	        for(int i=0;i<romanDigits.length-1;i++){
	            if(!(romanDigits[i]=='I' || romanDigits[i]=='V' || romanDigits[i]=='X'
	              || romanDigits[i]=='L' || romanDigits[i]=='C' || romanDigits[i]=='D'    ||romanDigits[i]=='M')) break;
	            if((int)(hashMap.get(romanDigits[i] )  )                
	            		            <(int)(hashMap.get(romanDigits[i+1]))){
	                sum=sum-(int)hashMap.get(romanDigits[i]);
	            }
	           
	            else {
	                sum=sum+(int)hashMap.get(romanDigits[i]);
	              
	            }
	        }
	//        System.out.println(romanDigits[romanDigits.length-1]);
	 
	            sum=sum+(int)hashMap.get(romanDigits[romanDigits.length-1]);
	        
	        return sum;
	    }
	     public static void main(String[]args){
	    	 RomanToNumber romanToNumber = new RomanToNumber();
	        System.out.println( romanToNumber.romanToInt("xl"));
	     }
	}
	
