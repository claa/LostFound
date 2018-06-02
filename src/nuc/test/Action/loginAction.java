package nuc.test.Action;

import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.test.Service.userService;
import nuc.test.vo.User;

public class loginAction extends ActionSupport implements ModelDriven<User> {

	 private User user=new User();
	 private userService us=new userService();
	 public  String loginMethod() throws Exception {
		 ResultSet rs=us.FoundName(user.getNo());
		 if(rs.next()) {
			 ActionContext.getContext().getSession().put("loginname",rs.getString("username"));
		 }
		
		 ActionContext.getContext().getSession().put("loginno",user.getNo());
		 ActionContext.getContext().getSession().put("loginpa",user.getPassword());
		 if(us.Login(user)) {
		  return "loginOk";
		 }else {
			 return "loginFail";
		 }
	 }
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
       
}
