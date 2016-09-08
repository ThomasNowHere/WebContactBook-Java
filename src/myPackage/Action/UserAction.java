package myPackage.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import myPackage.Model.UserModel;
import myPackage.Service.UserService;

public class UserAction extends ActionSupport implements SessionAware, ModelDriven<UserModel> {
    
	private static final long serialVersionUID = 1L;
	private UserModel user = new UserModel();
    private Map<String, Object> session;
    private List<UserModel> list1 = new ArrayList<UserModel>();
    
    public int getCount(){
		return list1.size();
	}
	
	public List<UserModel> getList1(){
		return list1;
	}
	public void setList1(List<UserModel>list1){
		this.list1 = list1;
	}
	
    //method to validate user
    public String validateUser(){
    	if(UserService.authenticateUser(user.getUname(), user.getPwd())){
    		session.put("uname", user.getUname());
    		return SUCCESS;
    	}else{
    		this.addActionError("Incorect username or password!!!");
    		return LOGIN;
    	}
    }
    
    
    //method to logout
    public String logoutUser(){
    	session.remove("uname");
    	return LOGIN;
    }
    //method to registerUser
    public String registerUser(){
    	String check=listUsersCheck();
  
    	if(check=="ok"){
		        if(UserService.registerUser(user)){
		    		this.session.put("uname", user.getUname());
		    		this.addActionMessage("User registred");
		    		return SUCCESS;
		    	}else{
		    		this.addActionError("Registration failed, please try again");
		    		return LOGIN;
		       	} 
    	}else{
    		this.addActionError(check);
    		return LOGIN;
    	}
    }
    
    //method for check username and password and checking if user already exist
    public String listUsersCheck(){
    	this.list1 = UserService.getListUsers();
    	int z=1;
		for (UserModel i : list1){
		if(new String(user.getUname()).equals(i.getUname())){
			z=0;
		    }
		}
		if(user.getUname().length() < 4){
			return "Username must be atleast 4 characters long";
		}
		else if(user.getPwd().length() < 5){
			return "Password must be atleast 5 characters long";
		}
		else if(user.getEmail().length() < 3){
			return "Email must be atleast 3 characters long";
		}
		else if(user.getAddress().length() < 3){
			return "Address must be atleast 3 characters long";
		}
		else if(z==0){
			return "Username already exist, please choose another username";
		}else{
			return "ok";
		}
	}
    
    public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	@Override
	public UserModel getModel() {
		return user;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
}
