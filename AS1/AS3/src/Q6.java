
public class Q6 {
	
	public static void firstNonReapeat(int arr[] ,int key)
	{ 
		int count=0;
		for(int i=0;i<arr.length;i++)
		{  
	
			count++;
	          if(arr[i]==key)
				break;
			System.out.println("element rank is"+count);
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{   
		
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		int key=20;
		firstNonReapeat(arr,key);
		
		
	}
	
	

}
