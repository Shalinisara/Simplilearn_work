package BytePkg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos=new FileOutputStream("TestFolder/File_06.txt");
			bos=new BufferedOutputStream(fos);
			String s = "Hi From File 06";
			byte b[] = s.getBytes();
			bos.write(b);
			System.out.println("Message written successfully");
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
			 catch (IOException e) {
				 System.out.println(e);
			} 
		finally{
			try {
				bos.flush();
				bos.close();
				fos.close();  
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		 
		
 		
 		
 
	}                      

}
