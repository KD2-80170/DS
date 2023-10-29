import java.util.Arrays;

public class Bubblesort {

	
	public static void bubblesort(int arr[],int n)
	{  int count =0;
	     for(int i=1;i<n-1;i++)
	     {
	    	for(int j=0;j<n-1;j++) 
	    	{   
	    		 count++;
	    		if(arr[j]>arr[j+1])
	    		{
	    			int temp =arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    		
	    	}
	    	 
	     }
	     System.out.println("number of comparision "+count);
	}
	
	public static void main(String[] args)
	{
		int arr[]= {33,11,55,66,77};
		System.out.println("before buble sort"+Arrays.toString(arr));
		bubblesort(arr,arr.length);
		System.out.println("after bubble sort"+Arrays.toString(arr));
	}
	
	
}
