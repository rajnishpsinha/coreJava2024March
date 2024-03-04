package stackoverflow;

public class Stringdelimit {
	public static void main(String[] args){
	String[] name = {"amit", "rahul", "surya"};
	
	String joined = String.join(",", name);
System.out.println(joined);
	}
}
