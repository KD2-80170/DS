import java.util.Scanner;

public class Binarysearch {
	
	
     public static int Bsearh(int arr[],int size, int k)
     { 
         int left=0,right=size-1,mid;
         while(right>=left)
         {
        	mid=(left+right)/2;
        	if(arr[mid]==k)
        		return mid;
        	else if(k<arr[mid])
        	{
        	   right=mid-1;
        	   
        	}
        	else
        	{ 
        		left=mid+1;
        		
        	}
        
        	 
         }
       return -1;     
     } 
	public static void main(String[] args)
	{
		int arr[]= {11,22,33,44,55,66,77};
		System.out.println("enter key to search");
		int key=new Scanner(System.in).nextInt();
		
		int g=Bsearh(arr,arr.length,key);
		if(g==-1)
		{   System.out.println("key is present at index"+g);  }
		else
		{System.out.println(g); }
		
	}
	
}
