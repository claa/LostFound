package nuc.test.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import nuc.test.coon.DBcoon;
import nuc.test.vo.User;


public class userDao {
	
	//注册
	 public int Insert(User user) {
     	PreparedStatement pst=null;
     	int rs=0;
     	DBcoon coon=new DBcoon();
     	Connection coona=coon.getCoon();
     	String sql_insert="insert into user(no,username,password,truepw) values (?,?,?,?)";
     	try {
				pst=coona.prepareStatement(sql_insert);
				pst.setString(1, user.getNo());
				pst.setString(2, user.getUsername());		
				pst.setString(3, user.getPassword());		
				pst.setString(4, user.getTruepw());		
				rs=pst.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     	return rs;
     }
     //验证登录
     public ResultSet testLogin(User user) {
     	PreparedStatement pst=null;
     	ResultSet rs=null;
     	DBcoon coon=new DBcoon();
     	Connection coona=coon.getCoon();
     	String sql_test="select * from user where no=? and password=?";
     	try {
				pst=coona.prepareStatement(sql_test);
				pst.setString(1, user.getNo());
				pst.setString(2, user.getPassword());
				rs=pst.executeQuery();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     	return rs;
     }
     //注册时检验用户名和密码是否存在
     public ResultSet testUser(User user) {
      	PreparedStatement pst=null;
      	ResultSet rs=null;
      	DBcoon coon=new DBcoon();
      	Connection coona=coon.getCoon();
      	String sql_test="select * from user where username=? or no=?";
      	try {
 				pst=coona.prepareStatement(sql_test);
 				pst.setString(1, user.getUsername());
 				pst.setString(2, user.getNo());
 				rs=pst.executeQuery();
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
      	return rs;
      }
     //根据学号查出用户名
     public ResultSet testName(String no) {
    	 PreparedStatement pst=null;
    	 ResultSet rs=null;
    	 DBcoon coon=new DBcoon();
    	 Connection coona=coon.getCoon();
    	 String sql_name="select username from user where no="+no+"";
    	  try {
			pst=coona.prepareStatement(sql_name);
			rs=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         return rs;
     }
}
