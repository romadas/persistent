package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ELTP1 {
	public static void main(String args[]){
			File directory = new File("C:\\Users\\Public\\Pictures");
			File contents[] = directory.listFiles();
			for(File f : contents){
				if(f.isFile()){
					System.out.println("file present : "+f.getName());
				}else if(f.isDirectory()){
					System.out.println("directory present : "+f.getName());
					
				}
			}
		
	}
}