package nuc.test.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.test.Service.userService;
import nuc.test.vo.User;

public class registerAction extends ActionSupport implements ModelDriven<User>{
    private User user=new User();
    private userService us=new userService();
    public String registerMethod() throws Exception {
    	if(us.checkUser(user)) {
    		ActionContext.getContext().put("error", "用户名或学号已存在,请换一个");
    	  return "registerFail";
    	}else {
    		 if(us.InsetUser(user)) {
    			 return "registerOk";
    		 }else {
    			ActionContext.getContext().put("error", "抱歉注册失败，请重新注册");
    			 return "registerFail";
    		 }
    	}
    }
    public void validate() {
		// TODO Auto-generated method stub
		if(user.getUsername()==null||user.getUsername().trim().equalsIgnoreCase("")) {
			this.addFieldError("username","用户名不能为空");
		}
		if(user.getPassword()==null||user.getPassword().trim().equals("")) {
			this.addFieldError("password","密码不能为空");
		}
		if(user.getTruepw()==null||user.getTruepw().trim().equals("")) {
			this.addFieldError("truepw","确认密码不能为空");
		}
		if(user.getNo()==null||user.getNo().trim().equals("")) {
			this.addFieldError("no","学号不能为空");
		}
		if(!user.getTruepw().equals(user.getPassword())) {
			this.addFieldError("truepw","两次密码不一样");
		}
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
