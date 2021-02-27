package FileOperPkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAdd {
	
	public void creFile(String str) {
	try {
		//Scanner s = new Scanner(System.in);
		//System.out.println("Please enter the file name that you would like to create: ");
		//String str = s.nextLine();
		//File fi = new File("create.txt");
		  File fi = new File("C:\\Users\\19086\\eclipse-workspace\\FileOperationsDemo\\TextFiles\\"+str+".txt");
		if (fi.createNewFile())
		{
			System.out.println("File created is: "+ fi.getName());
		}
		else
		{
			System.out.println("File already exists");
		}
	} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}