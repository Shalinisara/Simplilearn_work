package Calcipkg;

import java.util.Scanner;

public class CalciMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);    
	    System.out.println("Enter First No.");    
	    int a = in.nextInt();    
	    System.out.println("Enter Second No.");    
	    int b = in.nextInt();  
	    System.out.println("Enter the option that you need");
	    System.out.println("Option 1 - Add");
	    System.out.println("Option 2 - Subtract");
	    System.out.println("Option 3 - Multiply");
	    System.out.println("Option 4 - Divide");
	    int opt = in.nextInt();  
	    
	    switch (opt) {
	      case 1:
	        System.out.println("The sum is: "+ (a+b));
	        break;
	      case 2:
	    	System.out.println("The Difference is: "+ (a-b));
	        break;
	      case 3:
	        System.out.println("The product is: "+ (a*b));
	        break;
	      case 4:
	        System.out.println("The Quotient is: "+ (a/b));
	        break;
	      default:
	    	 System.out.println("Please choose a valid option 1 thru 4"); 
	    }
	    
	  
	}

}
