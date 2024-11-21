package arraypractice;

public class CopyTheArray {
	protected int[] copyArray(int[]source, int[]destination ){
		 System.arraycopy(source, 0, destination, 0, destination.length);		
		return destination;		
	}

	public static void main(String[] args) {
		int[] source= {1,2,5,6,7,59,67,48,7,30,40,6,32,63,72,89};
		int[]destination = new int[]{0,0,0,0,0};
		CopyTheArray copyTheArray = new CopyTheArray();
		copyTheArray.copyArray(source, destination);
		for(int i : destination){
			System.out.print(i+" ");
		}
		
	}
}
