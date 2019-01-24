package com.collections.map;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Map1 {
	static Map<File,List<File>> map=new HashMap<File,List<File>>();

		public static void main(String[] args) {
			getContent(new File("src"));
			for(Map.Entry<File,List<File>>m:map.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			}
			}
			public static void getContent(File folder){
				List<File> lf=new ArrayList<File>();
				if(folder.isDirectory()){
				for(File t:folder.listFiles()){
				lf.add(t);
				getContent(t);
			} 
			map.put(folder,lf);
			}
			}
			}



