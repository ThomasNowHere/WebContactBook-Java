package myPackage.Service;

import java.sql.*;
import java.util.ArrayList;
import myPackage.Model.AddressModel;

public class AddressService {
    
    public static int save(AddressModel addr) {
        int status = 0;
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "insert into address(name,address,phone,mobile,email,user_id) values(?,?,?,?,?,?)");
            ps.setString(1, addr.getName());
            ps.setString(2, addr.getAddress());
            ps.setString(3, addr.getPhone());
            ps.setString(4, addr.getMobile());
            ps.setString(5, addr.getEmail());
            ps.setInt(6, addr.getUserId());
            status = ps.executeUpdate();
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    // TODO: implement getAll, delete, update
}
