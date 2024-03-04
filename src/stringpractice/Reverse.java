package stringpractice;

public class Reverse {
	public static String reverseStringFirstMethod(String str){
		
		StringBuilder sb = new StringBuilder();
		for (int i= str.length()-1 ; i>=0 ; i--){
			sb.append(str.charAt(i));			
		}		
		return sb.toString();
	}
	
	public static String reverseStringSecondMethod(String str){
		
		StringBuilder sb= new StringBuilder(str);		
		return sb.reverse().toString();	
	}
	
	public static void main (String[]args){
	
		System.out.println(Reverse.reverseStringFirstMethod("Rajnish"));
		System.out.println(Reverse.reverseStringSecondMethod("Rajnish"));
		
	}

}
