package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String args[]){
		try{
			File inputFile=new File(args[0]);
			File outputFile=new File(args[1]);

			System.out.println(inputFile.getAbsolutePath());
		FileInputStream ifs = new FileInputStream(inputFile);
		FileOutputStream ofs = new FileOutputStream(outputFile);
	if(!(inputFile.exists()))
	{
		
		System.out.println("file do not exist");
	}
		int b;
	
		while((b=ifs.read())!=-1){
			ofs.write(b);
		}
		ifs.close();
		ofs.close();
		

		//inputFile.delete();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
