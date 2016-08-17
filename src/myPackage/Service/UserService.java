package myPackage.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import myPackage.Model.UserModel;

public class UserService {
    
    public static int register(UserModel user) {
        int status = 0;
        // TODO implement
        return status;
    }
    
    public static int checkLogin(String username, String password) {
        int userId = 0;
        // TODO implement
        return userId;
    }
}
