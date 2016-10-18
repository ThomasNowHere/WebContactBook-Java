package myPackage.Service;
import java.sql.DriverManager;
import java.sql.Connection;


public class Database {

	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/addressone", "root", "");
			return con;
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	public static void close(Connection con){
		try{
			con.close();
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
}
