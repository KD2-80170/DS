
public class program {
	 public static void main(String[] args)
	 {
		 Employees arr[]=new Employees[5];
		 arr[0]=new Employees(1,"hrishkesh",1000.0);
		 arr[1]=new Employees(2,"B",200.0);
		 arr[2]=new Employees(3,"c",300.0);
		 arr[3]=new Employees(4,"d",400.0);
		 arr[4]=new Employees(5,"e",500.0);
		
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i].getEmpid()==1)
			 {
				 System.out.println(arr[i]);
			 }
			 
		 }
		 
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 if(arr[i].getSalary()==200.0)
			 {  System.out.println(arr[i]);
			 }
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i].getName()=="B") 
			 {
				 System.out.println(arr[i]);
			 }
			 
		 }
		 
	 }
	
	

}
