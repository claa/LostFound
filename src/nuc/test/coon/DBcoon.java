package nuc.test.coon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcoon {
	public static final String DBDRIVER="org.gjt.mm.mysql.Driver"; //��������
	  public static final String DBURL="jdbc:mysql://localhost:3306/foundlost";//������ַ
	  public static final String DBUSER="root";//�û���
	  public static final String DBPASS="15735659458zxc";//����
	  Connection conn=null;
	  //getCoon����     ����ֵΪ Connection conn
	       public Connection getCoon(){
	    	   try {//�׳��쳣
				Class.forName(DBDRIVER);//�������ݿ�
				conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);//�������ݿ�
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	   return conn;
	    	   
	       }
}
