

package shal_type_cast;
import  java.util.Scanner;
public class Shal_ex_cast {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Describes type casting 
		//implicit type casting
		int x = 33;
		long y = x;
		System.out.println("the value of int to long is " +y);
		double z = y;
		System.out.println(" the value of long to double is "+z);
		float f = 1.902f;
		//Explicit type casting
		int g = (int)f;
		System.out.println("Value of float to int " +g);
		double d = 897.678d;
		long l =(long)d;
		int i =(int)d;
		System.out.println("Value of dbl to long is "+ l);
		System.out.println("Value of dbl to int is "+ i);
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String s = in.nextLine();
		//String s = "990";
		int s1 = Integer.parseInt(s);
		System.out.println("String to int : "+ s1);
		float f1 = Float.parseFloat(s);
		System.out.println("Srting to float : "+ f1);
		double d1 = Double.parseDouble(s);
		System.out.println("Srting to Double : "+ d1);
		

	}

}
