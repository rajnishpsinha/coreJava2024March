package genericpractice;

public class  ResponseType<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main( String[]args){
		ResponseType<String>name = new ResponseType<String>();
		name.setT("Rajnish");
		ResponseType<Integer>age = new ResponseType<Integer>();
		age.setT(44);
		
		
		
		
	}
	
}
