import java.util.Arrays;

public class Program{
	
	 public static void sort(Employees[] arr)
     { 
     	for(int i=0; i<arr.length-1;i++) 
     	{
     		
     		for(int j=i;j<(arr.length) ;j++)
     		{
     			if(arr[i].getSalary()<arr[j].getSalary())
     			{
     				Employees temp =arr[i];
     				arr[i]=arr[j];
     				arr[j]=temp;
     			}
     		}
     	}
     	System.out.println(Arrays.toString(arr));
     		
     }

	public static void main(String[] args)
	{
		
		      Employees arr[]=new Employees[5];
				 arr[0]=new Employees(1,"hrishkesh",1000.0);
				 arr[1]=new Employees(2,"B",200.0);
				 arr[2]=new Employees(3,"c",900.0);
				 arr[3]=new Employees(4,"d",400.0);
		         arr[4]=new Employees(5,"e",500.0);
		         
		sort( arr)  ;       
	}}         
		         
		    
		         
	
