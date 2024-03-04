package sorting;

public class Countingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {2,8,8,27,41,15,27,0,0,3,85,24,75,15,8};
int max= 85;
int[] arr1= new int[86];
for (int i=0; i<arr1.length; i++)
{
arr1[i]=0;	
}

for (int j=0;j<arr.length; j++)
{
arr1[arr[j]]++	;
	}
for (int k=1;k<arr1.length;k++)
{
	arr1[k]=arr1[k-1]+arr1[k];
}
int[]arr2= new int[arr.length];
for (int l=0;l<arr.length;l++)
{
arr2[arr1[arr[l]] -1	] = arr[l];
arr1[arr[l]]--;
}
//printing final values of sorted array
for (int m=0; m<arr2.length;m++)
System.out.print(arr2[m]+"   ");

	}

}
