import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
	static Connection con;
	static String url="jdbc:mysql://127.0.0.1:3306/bookshow";
	static String user="root";
	static String pass="root";
	
	public static Connection getConnection(){
		if(con!=null)
			return con;
		else{
			try {
				Class.forName("com.mysql.jdbc.Driver");	
				con=DriverManager.getConnection(url,user,pass);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	return con;
	}
}
