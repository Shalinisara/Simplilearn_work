package FileOperPkg;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileDisplay {
	public void srtFile()
	{
		File srchdir = new File("C:\\Users\\19086\\eclipse-workspace\\FileOperationsDemo\\TextFiles\\");
		if(srchdir.isDirectory())
		{
			List<String> listFile = Arrays.asList(srchdir.list());
			//System.out.println("List unsorted");
			//for(String s:listFile) {
			//	System.out.println(s);
			//}
			Collections.sort(listFile);
			for(String s:listFile) {
				System.out.println(s);
			}
		}
	}
}
