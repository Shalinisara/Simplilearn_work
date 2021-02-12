package Methodpkg;

public class MethodTyp {

	public static void main(String[] args) {
		MethodChild m = new MethodChild();
		m.Welcome(); // Calling method without return type
		int sum=m.add(5,10);// calling method with return type
		System.out.println(" Method with return type --> The sum is: "+sum);
		//Call by value 
		System.out.println("Call by value - Before " +m.data);
		m.change(500);
		System.out.println("Call by value - After " +m.data);
		//Call by reference
		System.out.println("Call by refrence - Before "+m.data);
		m.change1(m);
		System.out.println("Call by reference - After "+m.data);
		
	
	}

}
