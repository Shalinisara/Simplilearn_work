package FileOperPkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDel {
	
	public void delFile(String str) {
	//Scanner s = new Scanner(System.in);
	//System.out.println("Please enter the file name that you would like to create: ");
	//String str = s.nextLine();
	//File fi = new File("create.txt");
	  File fi = new File("C:\\Users\\19086\\eclipse-workspace\\FileOperationsDemo\\TextFiles\\"+str+".txt");
	if (fi.delete())
	{
		System.out.println("File that is Deleted is: "+ fi.getName());
	}
	else
	{
		System.out.println("File does not exist to be deleted");
	}
}
}