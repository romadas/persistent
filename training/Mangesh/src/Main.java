import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) throws SQLException, ParseException {
		try(BufferedReader br=new BufferedReader(new FileReader("movies.txt"))){
			String line;
			while((line=br.readLine())!=null){
				String[] arr=line.split(",");
				String name=arr[1];
				String lang=arr[2];
				Date date=sqlDate(arr[3]);
				Movie m=new Movie(name,lang,date);
				m.addShow();			
			}
		}catch(FileNotFoundException e){
			System.out.println("FileNotFound");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Date sqlDate(String string) throws ParseException {
		SimpleDateFormat idf=new SimpleDateFormat("dd/M/y");
		return Date.valueOf(new SimpleDateFormat("yyyy-M-dd").format(idf.parse(string)));
	}

}
