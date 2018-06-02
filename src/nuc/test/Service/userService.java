package nuc.test.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import nuc.test.Dao.userDao;
import nuc.test.vo.User;

public class userService {
	    userDao userdao=new userDao();
	    
	   //判断注册是否成功
       public boolean InsetUser(User user) {
    	     if(userdao.Insert(user)!=0) {
    	    	 return true;
    	     }else {
    	    	 return false;
    	     }
       }
       //判断登录是否成功
       public boolean Login(User user) throws Exception {
    	   ResultSet rs=userdao.testLogin(user);
    	   if(rs.next()) {
    		   return true;
    	   }else {
    		   return false;
    	   }
       }
       //注册时判断用户名是否已存在
       public boolean checkUser(User user) throws Exception {
    	   ResultSet rs=userdao.testUser(user);
    	   if(rs.next()) {
    		   return true;
    	   }else {
    		   return false;
    	   }
       }
      //根据学号查出用户名
       public ResultSet FoundName(String nos) {
    	   return userdao.testName(nos);
       }
}
