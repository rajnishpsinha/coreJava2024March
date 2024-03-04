package genericpractice;

public class GenericMethods {
public static  boolean isEqual(ResponseType<?> t1, ResponseType<?> t2){
	
	if(t1.getT().equals(t2.getT()) ){
		return true;
	}
	return false;}

	
public static <T> boolean checkEqual(ResponseType<T> t1, ResponseType<T> t2)
		{
	if(t1.getT().equals(t2.getT()) ){
		return true;
	}
	
	return false;
	
		}

public static void main(String[] args) {

	ResponseType<String> name1= new ResponseType<String>();
	name1.setT("Ram");
	ResponseType<String> name2= new ResponseType<String>();
	name1.setT("Rama");
	ResponseType<Integer> age1= new ResponseType<Integer>();
	ResponseType<Integer> age2= new ResponseType<Integer>();
	age1.setT(45);
	age2.setT(45);
	System.out.println(checkEqual(name1,name2));
	System.out.println(checkEqual(age1,age2));
	
	//	checkEqual(name1,name2);
}

}
