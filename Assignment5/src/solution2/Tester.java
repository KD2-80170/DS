package solution2;

public class Tester {
	
	public static void main(String[] args) {
		StackLL st=new StackLL();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
	}
}
