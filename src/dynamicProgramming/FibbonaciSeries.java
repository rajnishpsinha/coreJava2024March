package dynamicProgramming;

/*Example of dymanic programming with bottom up approach*/

public class FibbonaciSeries {
	
	public static int[] getFibonacciSeries(int n){
		
		int[] result = new int[n];
		int i= 0;
		while(i<n){
			
			if(i==0) result[i]=0;
			else if (i==1) result[i]=1;
			else {
				result[i]=result[i-1]+result[i-2];
			}
			i++;
		}			
		
		return result ;
	}
	public static void main(String[] args){
		
		int[]fibonnaciSeroes= getFibonacciSeries(10);
		for(int j: fibonnaciSeroes)System.out.print(j+ " ");
	}

}
