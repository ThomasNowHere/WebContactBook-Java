package myPackage.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import myPackage.Model.UserModel;

public class UserService {

	//method to register user
	public static boolean registerUser(UserModel model){
		Connection con = null;
		try{
			con = Database.getConnection();
			java.sql.PreparedStatement ps = con.prepareStatement("INSERT INTO users(uname, pwd, email, address) values (?,?,?,?)");
			ps.setString(1, model.getUname());
			ps.setString(2, model.getPwd());
			ps.setString(3, model.getAddress());
			ps.setString(4, model.getEmail());
			return ps.executeUpdate() == 1;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}finally{
			Database.close(con);
		}
	}
	
	//method to login 
	public static boolean loginUser(String uname , String pwd){
		Connection con = null;
		try{
			con = Database.getConnection();
			java.sql.PreparedStatement ps = con.prepareStatement("SELECT uname FROM users WHERE uname = ? , pwd = ?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			return ps.executeQuery().next();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}finally{
			Database.close(con);
		}
	}
	
	//method to validate login
		public static boolean authenticateUser(String uname, String pwd){
			Connection con = null;
			try{
		    con = Database.getConnection();
		    java.sql.PreparedStatement ps = con.prepareStatement("SELECT uname FROM users WHERE uname = ? and pwd = ?");
		    ps.setString(1, uname);
			ps.setString(2, pwd);
			return ps.executeQuery().next();
			}catch(Exception ex){
				System.out.println(ex.getMessage());
				return false;
			}finally{
				Database.close(con);
			}
		}
		//method to check users, to be sure is there already exist username like new username for registration
		public static List<UserModel> getListUsers(){
			Connection con = null;
			try{
			con = Database.getConnection();
			java.sql.PreparedStatement ps = con.prepareStatement("SELECT uname FROM users");
			ResultSet rs = ps.executeQuery();
			List<UserModel> list1 = new ArrayList<UserModel>();
			while(rs.next()){
				UserModel model = new UserModel(rs.getString(1));
				list1.add(model);
			}
			rs.close();
			return list1;
			
			}catch(Exception ex){
				System.out.println(ex.getMessage());
				
				return null;
			}
			finally{
				Database.close(con);
			}
		}
}
