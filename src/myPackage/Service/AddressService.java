package myPackage.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import myPackage.Model.AddressModel;

public class AddressService {

	
	//method to registerService
	public static boolean registerAddress(String name, AddressModel address){
		Connection con = null;
		try{
		int addresId = ((int) (new Date()).getTime())*-1;	
		con = Database.getConnection();
		java.sql.PreparedStatement ps = con.prepareStatement("INSERT INTO address(id ,street, street_no, city_id) VALUES (?,?,?,?);");
		java.sql.PreparedStatement ps2 = con.prepareStatement("INSERT INTO contact(uname,first_name,last_name,phone,email,sex_id,address_id) VALUES (?,?,?,?,?,?,?); ");
		ps.setInt(1, addresId);
		ps.setString(2, address.getStreet());
		ps.setString(3, (address.getStreet_no()));
		ps.setInt(4, address.getCity_id());
		ps2.setString(1, name);
		ps2.setString(2, address.getFirst_name());
		ps2.setString(3, address.getLast_name());
		ps2.setString(4, address.getPhone());
		ps2.setString(5, address.getEmail());
		ps2.setInt(6, address.getSex_id());
		ps2.setInt(7, addresId);
		
		return (ps.executeUpdate()==1 && ps2.executeUpdate()==1);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}
		finally{
			Database.close(con);
		}
	}
	public static boolean modifyAddress(AddressModel model){
		Connection con = null;
		try{
		con = Database.getConnection();
		java.sql.PreparedStatement ps = con.prepareStatement("UPDATE address,contact SET address.street =?,address.street_no=?,address.city_id=?,contact.first_name=?,contact.last_name=?,contact.phone=?,contact.email=?,contact.sex_id=? WHERE address.id=contact.address_id AND contact.id=?;");
		
	    ps.setString(1, model.getStreet());
		ps.setString(2, model.getStreet_no());
		ps.setInt(3, model.getCity_id());
		ps.setString(4, model.getFirst_name());
		ps.setString(5, model.getLast_name());
		ps.setString(6, model.getPhone());
		ps.setString(7, model.getEmail());
		ps.setInt(8, model.getSex_id());
		ps.setInt(9, model.getId());
		ps.executeUpdate();
		return true;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}
		finally{
			Database.close(con);
		}
	}
	public static boolean deleteAddress(AddressModel model){
		Connection con = null;
		try{
		con = Database.getConnection();
		java.sql.PreparedStatement ps = con.prepareStatement("DELETE contact,address FROM contact INNER JOIN address ON contact.address_id=address.id WHERE contact.id=? ");
		ps.setInt(1, model.getId());
		ps.executeUpdate();
		return true;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}
		finally{
			Database.close(con);
		}
	}
	public static List<AddressModel> getList(String uname){
		Connection con = null;
		try{
		con = Database.getConnection();
		java.sql.PreparedStatement ps = con.prepareStatement("SELECT contact.id,contact.first_name,contact.last_name, sex.name,contact.phone,contact.email,city.name,city.zip_code,address.street,address.street_no,country.name,country.alpha_2,country.alpha_3,sex.id,country.id,city.id,address.id FROM contact INNER JOIN sex ON contact.sex_id=sex.id INNER JOIN address  ON contact.address_id=address.id INNER JOIN city  ON address.city_id=city.id INNER JOIN country ON city.country_id=country.id WHERE contact.uname=?");
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		List<AddressModel> list = new ArrayList<AddressModel>();
		while(rs.next()){
			AddressModel model = new AddressModel(rs.getInt(1), rs.getString(2), rs.getString(3) , rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getInt(15),rs.getInt(16),rs.getInt(17));
			list.add(model);
		}
		rs.close();
		return list;
		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			
			return null;
		}
		finally{
			Database.close(con);
		}
	}
}
