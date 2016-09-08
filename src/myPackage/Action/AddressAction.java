package myPackage.Action;

import com.opensymphony.xwork2.ActionSupport;
import myPackage.Model.AddressModel;
import myPackage.Service.AddressService;
import org.apache.struts2.interceptor.SessionAware;
import java.util.*;

public class AddressAction extends ActionSupport implements SessionAware {
    
    private AddressModel address;
    private ArrayList<AddressModel> addressList;
    private Map<String, Object> session;
    private int id;
    
    public String add() {
        int userId = (int) session.get("userId");
        address.setUserId(userId);
        AddressService.save(address);
        return SUCCESS;
    }
    
    // TODO: view, delete, modify
    
    public AddressModel getAddress() { return address; }
    public void setAddress(AddressModel address) { this.address = address; }
    public void setSession(Map<String, Object> session) { this.session = session; }
}
