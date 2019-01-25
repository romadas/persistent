package com.collections.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) {
		CountWords c = new CountWords();
		c.countWords("read.txt");

	}
	public int countWords(String filePath){
		File f = new File(filePath);
		int count = 0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null){
					String str[] = line.split(" ");
					for(String p : str){
						count++;
				}
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

}
