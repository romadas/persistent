package com.collections.map;

import java.io.File;
import java.io.IOException;

public class SearchUtility {
	public static void main(String args[]) throws IOException{
			System.out.println(searchFile("C:\\Workspace\\training\\Nugget\\src", "SearchUtility.java"));

		}

		static public boolean searchFile(String path,String filename) throws IOException{
			
			File f=new File(path);		
			System.out.println(f);
			if(f.isDirectory()){
				for(File fi:f.listFiles())
					
					return searchFile(fi.getAbsolutePath(), filename);
			}
			else if(f.getName().equals(filename))
				{
				System.out.println("matched");
				return true;
				}
			return searchFile(f.getAbsolutePath(), filename);
			//return false;
		}
		
}
