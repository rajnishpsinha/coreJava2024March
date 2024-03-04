package sorting;

public class Quicksort {


int partition (int[] arr, int low,int high) 
{
	int pivot=  arr[low];
	int i= low;
	int j= high;
	while(i<j)
	{
		do {i++;}
		while(arr[i]<= pivot);
		
	
	do{j--;}
	while (arr[j]>pivot);
	
	if (i<j)
	{
		//swap
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	}	
	//swap
			int temp=arr[low];
			arr[low]=arr[j];
			arr[j]=temp;
	return j;
	
}

public void quickSort (int[] arr, int low, int high)
{
	if (low<high)
	{
		int j = partition (arr, low,high);
		System.out.print("pivot: "+ j+'\n');
	
		quickSort(arr,low,j);
		quickSort(arr,j+1,high);
	}
	}
public static void main(String[]args)
{
Quicksort qk = new Quicksort();
int[] age= new int[]{15,81,20,57,13,45,81,7,90,200};
qk.quickSort(age, 0, 9);
for(int e:age)
{
	System.out.print(e+"  ");
	}
}
}

