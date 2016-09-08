package myPackage.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import myPackage.Model.AddressModel;
import myPackage.Service.AddressService;

public class AddressAction extends ActionSupport implements SessionAware, ModelDriven<AddressModel>{
	
	private static final long serialVersionUID = 1L;
	private AddressModel address = new AddressModel();
	private Map<String, Object> session;
	private List<AddressModel> list = new ArrayList<AddressModel>();
	
	public int getCount(){
		return list.size();
	}
	
	public List<AddressModel> getList(){
		return list;
	}
	public void setList(List<AddressModel>list){
		this.list = list;
	}
	
	//method to add address
	public String addAddress(){
		String check = checkFields();
		if(check == "ok"){
			if(AddressService.registerAddress(session.get("uname").toString(),address)){
				this.addActionMessage("Address Added successfully!");
				return "add";
			}else{
				this.addActionError("Address is not added, try again..!");
				return "again";
			}
		}
		else{
			this.addActionError(check);
			return "again";
		}
	}
	public String modifyAddress(){
		return "modify";
	}
	public String updateAddress(){
		String check = checkFields();
		if(check == "ok"){
				if(AddressService.modifyAddress(address)){
					this.addActionMessage("Address modified...");
					return "update";
				}else{
					this.addActionError("Details are not modified..!");
				return "again1";}
		}else{
			this.addActionError(check);
			return "again1";
		}
	}
	public String deleteAddress(){
		if(AddressService.deleteAddress(address)){
			this.addActionMessage("Deleted successfully");
		}else{
			this.addActionError("Not deleted..!");
		}return "delete";	
	}
	//method for address list view
	public String listAddress(){
		this.list = AddressService.getList(session.get("uname").toString());
		return "view";
	}
    //method to check empty fields
	public String checkFields(){
    	if(address.getFirst_name().length() < 3){
			return "First name must be atleast 3 characters long";
		}
		else if(address.getLast_name().length() < 3){
			return "Last name must be atleast 3 characters long";
		}
		else if(address.getPhone().length() < 5){
			return "Phone number must be atleast 5 characters long";
		}
		else if(address.getEmail().length() < 5){
			return "Email must be atleast 3 characters long";
		}
		else if((Integer) address.getCountry_id() == 0){
			return "Select country";
		}
		else if((Integer) address.getCity_id() == 0){
			return "Select city";
		}
		else if(address.getStreet().length() < 3){
			return "Street name must be atleast 3 characters long";
		}
		else if(address.getStreet_no().length() <1){
			return "Enter street number";
		}else{
			return "ok";
		}
	}
	
    public AddressModel getAddress(){
    	return address;
    }
    public void setAddress(AddressModel addressa){
    	this.address = addressa;
    }
	@Override
	public AddressModel getModel() {
		return address;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}
	
}
