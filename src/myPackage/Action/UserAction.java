package myPackage.Action;

import com.opensymphony.xwork2.ActionSupport;
import myPackage.Model.UserModel;
import myPackage.Service.UserService;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class UserAction extends ActionSupport implements SessionAware {
    
    private UserModel user;
    private Map<String, Object> session;
    
    public String login() {
        // TODO implement
        return SUCCESS;
    }
    
    public String register() {
        // TODO implement
        return SUCCESS;
    }
    
    public UserModel getUser() { return user; }
    public void setUser(UserModel user) { this.user = user; }
    public void setSession(Map<String, Object> session) { this.session = session; }
}
