package functionalprogramming;
/* annonymous implementation of a functional interface*/
public class AnnonymousInterfaceImpl {

	public static void main(String[] args){
		Comparable comparable = new Comparable(){

			@Override
			public int compareTo(Object age) {
				Integer ageOfPerson=(Integer)age;  
			if(ageOfPerson<25){return 0;}
				return -1;
			}
			
		};  
		System.out.println(comparable.compareTo(28));
		System.out.println(comparable.compareTo(23));
		
	}

}
