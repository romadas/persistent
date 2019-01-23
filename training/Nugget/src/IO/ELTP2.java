package IO;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class ELTP2 {
	public static void main(String args[]){
		File f = new File("byte.txt");
		try {
			if(f.createNewFile()){
				System.out.println("file created");
			}else{
				System.out.println("file not created");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		String str = "roma";
		try(FileWriter fw = new FileWriter("byte.txt")){
			fw.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}try(FileReader fr = new FileReader("byte.txt")){
			String s;
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!=null){
				System.out.println(s);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		byte[] bytes = str.getBytes();
		try(FileWriter fw = new FileWriter("byte.txt")){
			fw.write(bytes.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}/* ByteArrayOutputStream bout = new ByteArrayOutputStream();
		try {
			System.out.print(bout.write(bytes));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	
}
