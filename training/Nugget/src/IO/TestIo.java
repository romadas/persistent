package IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestIo {

	public static void main(String[] args)  {
		Scanner obj = new Scanner(System.in);
		String str;
		str = obj.nextLine();
		File f1 = new File("io.txt");
		char buffer[] = new char[str.length()];
		str.getChars(0, str.length(), buffer, 0);
		try{
			if(f1.createNewFile()){
				System.out.println("file created");
			}
			else{
				System.out.println("file already created ");
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e ){
			e.printStackTrace();
		}
		try(FileWriter f = new FileWriter("io.txt",true)){
			f.write(buffer);
			f.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}try(FileReader fr = new FileReader("io.txt")){
			String s;
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	if(f1.delete()){
		System.out.println("file successfully deleted");
	}else{
		System.out.println("file not deleted");
	}
	
	}
}
