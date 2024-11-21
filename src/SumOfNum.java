
public class SumOfNum {
	private  int sumOfDigits(int num){		
		int sum=0;
		while(num>0){
			
			int remainder= num%10;
			sum=sum+remainder;
			num=num/10;
			if(num==0 && sum>=10){num=sum; sum=0;}
			if(num==0 && sum<=10)break;
		};			
		return sum;
	}
	public static void main(String[] args) {
		SumOfNum sumOfNum = new SumOfNum();
		int output= sumOfNum.sumOfDigits(435766);
		System.out.println("output "+output);
	}
}
