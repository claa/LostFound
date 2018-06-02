package nuc.test.Dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

import nuc.test.coon.DBcoon;
import nuc.test.vo.Info;

public class infoDao {
	//把Found数据放入到数据库中
      public int InsertFound(Info info){
    	  PreparedStatement pst=null;
    	  int rs=0;
    	  DBcoon coon=new DBcoon();
    	  Connection coona=coon.getCoon();
    	  String sql_insert="insert into found(title,name,kind,place,user,phone,time,photo,datetime) values (?,?,?,?,?,?,?,?,?)";
    	  
    	  try {
			pst=coona.prepareStatement(sql_insert);
			pst.setString(1, info.getTitle());
			pst.setString(2, info.getName());
			pst.setString(3, info.getKind());
			pst.setString(4, info.getPlace());
			pst.setString(5, info.getUser());
			pst.setString(6, info.getPhone());
			pst.setString(7, info.getTime());
	      
			InputStream str=new FileInputStream(info.getPhoto());//把图片放进数据库中
			long length=(long)str.available();
			pst.setBinaryStream(8, str, length);
			
			DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //规定日期格式ʽ2005-8-8 9:17:42 
		    String datetime=mediumDateFormat.format(new Date());// new Date()
		  
			pst.setString(9, datetime);
		
			rs=pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return rs;  
      }
      
      //对Found数据进行全部查询
    public ResultSet QueryFound() {
    	  PreparedStatement pst=null;
   	      ResultSet rst=null;
   	      DBcoon coon=new DBcoon();
   	      Connection coona = coon.getCoon();
   	      String sql_query="select * from found";
   	      
   	      try {
			pst=coona.prepareStatement(sql_query);
			rst=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	      return rst;
    }
    //根据Found题目进行查询
    public ResultSet SelectFound(Info info) {
    	PreparedStatement pst=null;
    	ResultSet rst=null;
    	DBcoon coon=new DBcoon();
 	      Connection coona = coon.getCoon();
 	      String sql_select="select * from found where title=?";
 	      try {
			pst=coona.prepareStatement(sql_select);
			pst.setString(1, info.getTitle());
			rst=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return rst;
    }
    
    //对Found题目进行模糊查询
    public ResultSet SelectTitle(Info info) {
    	PreparedStatement pst=null;
    	ResultSet rst=null;
    	DBcoon coon = new DBcoon();
    	Connection coona=coon.getCoon();
    	String sql_title="select * from found where title like concat('%',?,'%') ";//concat sql语句来连接函数    '%?%' 这样写会报Parameter index out of range (1 > number of parameters, which is 0).
        try {
			pst=coona.prepareStatement(sql_title);
			pst.setString(1, info.getTitle());
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    	return rst;
    }
   //按时间对Found结果进行倒序排序 desc
    public ResultSet SelectOrder() {
    	PreparedStatement pst=null;
    	ResultSet rst=null;
    	DBcoon coon=new DBcoon();
    	Connection coona =coon.getCoon();
    	String sql_order="select * from found order by datetime desc";
    	try {
			pst=coona.prepareStatement(sql_order);
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return rst;
    }
    //根据id对Found结果进行查询
    public ResultSet SelectId(int id) {
    	PreparedStatement pst=null;
    	ResultSet rst=null;
    	DBcoon coon=new DBcoon();
    	Connection coona =coon.getCoon();
    	String sql_order="select * from found where id="+id+"";
    	try {
			pst=coona.prepareStatement(sql_order);
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return rst;
    }
    
    
    
  //把Lost数据放入到数据库中
    public int InsertLost(Info info){
  	  PreparedStatement pst=null;
  	  int rs=0;
  	  DBcoon coon=new DBcoon();
  	  Connection coona=coon.getCoon();
  	  String sql_insert="insert into lost(title,name,kind,place,user,phone,time,photo,datetime) values (?,?,?,?,?,?,?,?,?)";
  	  
  	  try {
			pst=coona.prepareStatement(sql_insert);
			pst.setString(1, info.getTitle());
			pst.setString(2, info.getName());
			pst.setString(3, info.getKind());
			pst.setString(4, info.getPlace());
			pst.setString(5, info.getUser());
			pst.setString(6, info.getPhone());
			pst.setString(7, info.getTime());
	      
			InputStream str=new FileInputStream(info.getPhoto());//把图片放进数据库中
			long length=(long)str.available();
			pst.setBinaryStream(8, str, length);
			
			DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //规定日期格式ʽ2005-8-8 9:17:42 
		    String datetime=mediumDateFormat.format(new Date());// new Date()
		  
			pst.setString(9, datetime);
		
			rs=pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	 return rs;  
    }
    
    //对Lost数据进行全部查询
  public ResultSet QueryLost() {
  	  PreparedStatement pst=null;
 	      ResultSet rst=null;
 	      DBcoon coon=new DBcoon();
 	      Connection coona = coon.getCoon();
 	      String sql_query="select * from lost";
 	      
 	      try {
			pst=coona.prepareStatement(sql_query);
			rst=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	      return rst;
  }
  //根据Lost题目进行查询
  public ResultSet SelectLost(Info info) {
  	PreparedStatement pst=null;
  	ResultSet rst=null;
  	DBcoon coon=new DBcoon();
	      Connection coona = coon.getCoon();
	      String sql_select="select * from lost where title=?";
	      try {
			pst=coona.prepareStatement(sql_select);
			pst.setString(1, info.getTitle());
			rst=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	return rst;
  }
  
  //对Lost题目进行模糊查询
  public ResultSet SelectLostTitle(Info info) {
  	PreparedStatement pst=null;
  	ResultSet rst=null;
  	DBcoon coon = new DBcoon();
  	Connection coona=coon.getCoon();
  	String sql_title="select * from lost where title like concat('%',?,'%') ";//concat sql语句来连接函数    '%?%' 这样写会报Parameter index out of range (1 > number of parameters, which is 0).
      try {
			pst=coona.prepareStatement(sql_title);
			pst.setString(1, info.getTitle());
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
  	return rst;
  }
 //按时间对Lost结果进行倒序排序 desc
  public ResultSet SelectLostOrder() {
  	PreparedStatement pst=null;
  	ResultSet rst=null;
  	DBcoon coon=new DBcoon();
  	Connection coona =coon.getCoon();
  	String sql_order="select * from lost order by datetime desc";
  	try {
			pst=coona.prepareStatement(sql_order);
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	return rst;
  }
  //根据id对Lost结果进行查询
  public ResultSet SelectLostId(int id) {
  	PreparedStatement pst=null;
  	ResultSet rst=null;
  	DBcoon coon=new DBcoon();
  	Connection coona =coon.getCoon();
  	String sql_order="select * from lost where id="+id+"";
  	try {
			pst=coona.prepareStatement(sql_order);
			rst=pst.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	return rst;
  }
  
  
		//把Animal数据放入到数据库中
		  public int InsertAnimal(Info info){
			  PreparedStatement pst=null;
			  int rs=0;
			  DBcoon coon=new DBcoon();
			  Connection coona=coon.getCoon();
			  String sql_insert="insert into animal(title,name,kind,place,user,phone,time,photo,datetime) values (?,?,?,?,?,?,?,?,?)";
			  
			  try {
					pst=coona.prepareStatement(sql_insert);
					pst.setString(1, info.getTitle());
					pst.setString(2, info.getName());
					pst.setString(3, info.getKind());
					pst.setString(4, info.getPlace());
					pst.setString(5, info.getUser());
					pst.setString(6, info.getPhone());
					pst.setString(7, info.getTime());
			      
					InputStream str=new FileInputStream(info.getPhoto());//把图片放进数据库中
					long length=(long)str.available();
					pst.setBinaryStream(8, str, length);
					
					DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //规定日期格式ʽ2005-8-8 9:17:42 
				    String datetime=mediumDateFormat.format(new Date());// new Date()
				  
					pst.setString(9, datetime);
				
					rs=pst.executeUpdate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 return rs;  
		  }
		  
				  //对Animal数据进行全部查询
				public ResultSet QueryAnimal() {
					  PreparedStatement pst=null;
					      ResultSet rst=null;
					      DBcoon coon=new DBcoon();
					      Connection coona = coon.getCoon();
					      String sql_query="select * from animal";
					      
					      try {
							pst=coona.prepareStatement(sql_query);
							rst=pst.executeQuery();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					      return rst;
				}
				//根据Animal题目进行查询
				public ResultSet SelectAnimal(Info info) {
					PreparedStatement pst=null;
					ResultSet rst=null;
					DBcoon coon=new DBcoon();
					      Connection coona = coon.getCoon();
					      String sql_select="select * from animal where title=?";
					      try {
							pst=coona.prepareStatement(sql_select);
							pst.setString(1, info.getTitle());
							rst=pst.executeQuery();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return rst;
				}
				
				//对Animal题目进行模糊查询
				public ResultSet SelectAnimalTitle(Info info) {
					PreparedStatement pst=null;
					ResultSet rst=null;
					DBcoon coon = new DBcoon();
					Connection coona=coon.getCoon();
					String sql_title="select * from animal where title like concat('%',?,'%') ";//concat sql语句来连接函数    '%?%' 这样写会报Parameter index out of range (1 > number of parameters, which is 0).
				    try {
							pst=coona.prepareStatement(sql_title);
							pst.setString(1, info.getTitle());
							rst=pst.executeQuery();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}    	
					return rst;
				}
				//按时间对Animal结果进行倒序排序 desc
				public ResultSet SelectAnimalOrder() {
					PreparedStatement pst=null;
					ResultSet rst=null;
					DBcoon coon=new DBcoon();
					Connection coona =coon.getCoon();
					String sql_order="select * from animal order by datetime desc";
					try {
							pst=coona.prepareStatement(sql_order);
							rst=pst.executeQuery();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return rst;
				}
				//根据id对Animal结果进行查询
				public ResultSet SelectAnimalId(int id) {
					PreparedStatement pst=null;
					ResultSet rst=null;
					DBcoon coon=new DBcoon();
					Connection coona =coon.getCoon();
					String sql_order="select * from animal where id="+id+"";
					try {
							pst=coona.prepareStatement(sql_order);
							rst=pst.executeQuery();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return rst;
				}
  
}
