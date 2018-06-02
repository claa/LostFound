package nuc.test.Interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import nuc.test.Service.userService;
import nuc.test.vo.User;

public class loginInterceptor extends AbstractInterceptor{
	 private User users=new User();
	 private userService us=new userService();
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ctx=arg0.getInvocationContext();
		String userno=(String)ctx.getSession().get("loginno");
		String userpa=(String)ctx.getSession().get("loginpa");
		users.setNo(userno);
		users.setPassword(userpa);
		if(userno!=null&&us.Login(users)) {
			return arg0.invoke();
		}else {
			return Action.LOGIN;
		}
		
	}

}
