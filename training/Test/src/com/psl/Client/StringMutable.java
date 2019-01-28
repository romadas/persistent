package com.psl.Client;




import java.io.File;
import java.io.IOException;

public class StringMutable {

	public static void main(String[] args) throws IOException {
	
		
		StringMutable obj=new StringMutable();
		System.out.println(obj.searchFile("src", "Polygon.java"));

	}

	public boolean searchFile(String path,String filename) throws IOException{
		boolean ans=false;
		File f=new File(path);
		System.out.println(f.getName());
		if(f.isDirectory())
			for(File fi:f.listFiles())
				ans=ans||searchFile(fi.toString(), filename);
		else if(f.getName().equals(filename))
			return true;
		return ans;
	}
	
}

