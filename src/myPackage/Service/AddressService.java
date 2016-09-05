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
    
    public static ArrayList<AddressModel> getAll(int userId) {
        ArrayList<AddressModel> list = new ArrayList<AddressModel>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from address where user_id=?");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                AddressModel addr = new AddressModel();
                addr.setId(rs.getInt("id"));
                addr.setName(rs.getString("name"));
                addr.setAddress(rs.getString("address"));
                addr.setPhone(rs.getString("phone"));
                addr.setMobile(rs.getString("mobile"));
                addr.setEmail(rs.getString("email"));
                addr.setUserId(rs.getInt("user_id"));
                list.add(addr);
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    // TODO: delete, update
}
