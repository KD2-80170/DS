import java.util.Arrays;

public class Selectionsort {
	
	
	
	
	public static void Ssort(int arr[],int N)
	{
	    int count=0;
	    for(int i=0;i<N-1;i++)
	    {
	    	
	    	for(int j=i+1;j<N;j++)
	    	{   count++;
	    		if(arr[i]>arr[j])
	    		{ 
	    	     int temp=arr[i];
	    	     arr[i]=arr[j];
	    	     arr[j]=temp;
	    	     
	    		}
	    	}
	    	
	    }
	
	
	
	    System.out.println(count);	
	
	}
	public static void main(String args[])
	{
		int[] arr= {33,11,22,44,55,66};
		System.out.println("string is"+Arrays.toString(arr));
		Ssort(arr,arr.length);
		System.out.println("after sort"+Arrays.toString(arr));
	}

}
