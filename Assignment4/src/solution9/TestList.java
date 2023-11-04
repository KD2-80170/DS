package solution9;



public class TestList {

	public static void main(String[] args) {
		
		SignlyLinear l1=new SignlyLinear();
		
		l1.addLast(10);
		l1.addLast(-1);
		l1.addLast(210);
		l1.addLast(110);
		l1.addLast(0);
		l1.addLast(100);
		l1.addLast(55);
		
		System.out.println(l1.max());
		System.out.println(l1.min());
		

	}

}
