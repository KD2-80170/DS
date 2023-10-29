import java.util.Arrays;

public class insertionsort {
	
	public static void insort(int arr[],int n)
	{ int count=0;
		for(int i=1;i<n;i++)
		{    
		        
			int flag=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>flag)
			{ count++;
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=flag;
		}
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[] ={22,11,44,33,66};
	System.out.println("element before sort"+Arrays.toString(arr));
	  insort(arr,arr.length);
	  System.out.println("after sort"+Arrays.toString(arr));
	
	}
	
}