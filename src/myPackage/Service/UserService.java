package myPackage.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import myPackage.Model.UserModel;

public class UserService {
    
    public static int register(UserModel user) {
        int status = 0;
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into users(username,password,email) values(?,?,?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            status = ps.executeUpdate();
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int checkLogin(String username, String password) {
        int userId = 0;
        // TODO implement
        return userId;
    }
}
