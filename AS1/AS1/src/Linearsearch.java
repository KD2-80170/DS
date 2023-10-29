import java.util.Scanner;

public class Linearsearch {
	
	static int search (int arr[],int key)
	   { 
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]==key)
		     { System.out.println("key is present");
		        return i;
		     }	
		}
		return -1;
	   }
	 public static void main(String[] args)
	     {
		 int arr[] = {11,22,33,44,55,66};
		 System.out.println("eneter element to be search");
		 int key=new Scanner(System.in).nextInt();
		   int i=search(arr,key);
		   if(i==-1)
		   {
		   System.out.println("key is not found"+i);
	       }
		   else
		   {
			System.out.println("key is found at index"+i);   
			}
		   }

}
