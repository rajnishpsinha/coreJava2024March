package exception.practice;

public  class LessAmountCustomException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public LessAmountCustomException(String message){
		super(message);
	}
	public static Boolean checkLessAmountCustomException(Double amount) throws LessAmountCustomException{
		if(amount.doubleValue()<5000){
			throw new LessAmountCustomException("Less than minimum balance");
		}
		else return Boolean.valueOf(true);
		
	}
	
	public static void main(String[]args){
	 try {
	//	System.out.println(checkLessAmountCustomException(6000.0));
		System.out.println(checkLessAmountCustomException(4000.0));

	} catch (LessAmountCustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
