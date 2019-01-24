package com.collections.map;

	import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

	public class Contents {
	public static void displayFolder(String fname) throws IOException  
	
	{	File f=new File(fname);
		System.out.println(f);
		if(f.isDirectory())
			for(File fi:f.listFiles())
				displayFolder(fi.getCanonicalPath());
		
	}
	      
	    
	    public static void main(String[] args) throws IOException 
	    { 
	          
	        displayFolder("src");       
	       
	    } 
	} 




