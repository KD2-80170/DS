import java.util.Scanner;

public class LinearQueue {
	
	public static void main(String args[])
	{
		int choice;
		Queue q=new Queue(5);
	
		do {
			System.out.println("0.for exit");
			System.out.println("1.for push");
			System.out.println("2.for pop");
			System.out.println("3.for peek");
		
			choice=new Scanner(System.in).nextInt();
			switch(choice)
			{
			case 1:
				if(q.isFull()) {
					System.out.println("qurue is full");
				}
				else
				{System.out.println("enter element:");
				int data=new Scanner(System.in).nextInt();
				q.push(data);}
				break;
			case 2:{
				if(q.isEmpty())
				{System.out.println("queue is empty"); }
				else {System.out.println("element is pop");
				q.pop();}}
				break;
			case 3:
				int k=q.peek();
				System.out.println("peek element is"+k);
				break;
			default:
				System.out.println("enter correct choice");
				break;
			
			}
		}while(choice!=0);
}}
