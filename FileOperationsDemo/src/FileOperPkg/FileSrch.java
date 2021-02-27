package FileOperPkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSrch {
	
	public void srchFile(String str) {
	//Scanner s = new Scanner(System.in);
	//System.out.println("Please enter the file name that you would like to create: ");
	//String str = s.nextLine();
	//File fi = new File("create.txt");
	  File fi = new File("C:\\\\Users\\\\19086\\\\eclipse-workspace\\\\FileOperationsDemo\\\\TextFiles\\\\"+str+".txt");
	if (fi.exists())
	{
		System.out.println("File "+ fi.getName()+ "Exists");
	    System.out.println("Absolute path: " + fi.getAbsolutePath());
	    System.out.println("Writeable: " + fi.canWrite());
	    System.out.println("Readable " + fi.canRead());
	    System.out.println("File size in bytes " + fi.length());
	}
	else
	{
		System.out.println("File does not exist");
	}
}
}