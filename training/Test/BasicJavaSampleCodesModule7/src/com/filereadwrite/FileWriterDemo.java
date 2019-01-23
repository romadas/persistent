package com.filereadwrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String str = "Welcome to Java";
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter("filewrite");
			fileWriter.write(str);
			System.out.println("String written in file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
