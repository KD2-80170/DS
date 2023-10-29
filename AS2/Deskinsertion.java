import java.util.Arrays;

public class Deskinsertion {
	
	public static void insort(int arr[],int n)
	{ 
		for(int i=1;i<n;i++)
		{    
		        
			int flag=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>flag)
			{ 
				
				
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=flag;
		}
	
	}
	
	public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = n-1; i >= 0; --i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String[] args)
	{
		int arr[] ={22,11,44,33,66};
	System.out.println("element before sort"+Arrays.toString(arr));
	  insort(arr,arr.length);
	  printArray(arr);
	
	}}
	