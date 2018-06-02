package nuc.test.Service;

import java.sql.ResultSet;

import nuc.test.Dao.infoDao;
import nuc.test.vo.Info;

public class InfoService {
	     infoDao infoMethod=new infoDao();
	     //判断是否插入Found成功。
         public boolean InsertInfo(Info info){
        	 if(infoMethod.InsertFound(info)!=0) {
      		   return true;
      	   }else {
      		   return false;
      	   }
        	 
         }
         //Found进行全部查询
         public ResultSet QueryInfo() {
        	 
        	 return infoMethod.QueryFound();
         };
         //根据Found标题进行查询
         public ResultSet SelectInfo(Info info) {
        	 
        	 return infoMethod.SelectFound(info); 
         }
         //对Found题目进行模糊查询
         public ResultSet SelectTitle(Info info) {
        	 
        	 return infoMethod.SelectTitle(info); 
        	 
         }
         //按时间对Found结果进行倒序遍历
         public ResultSet SelectInfos() {
        	 return infoMethod.SelectOrder();
         }
         //根据id对Found结果进行查询
         public ResultSet SelectIds(int ids) {
        	 return infoMethod.SelectId(ids);
         }
         
         
         
         //判断是否插入Lost成功。
         public boolean InsertLostInfo(Info info){
        	 if(infoMethod.InsertLost(info)!=0) {
      		   return true;
      	   }else {
      		   return false;
      	   }
        	 
         }
         //Lost进行全部查询
         public ResultSet QueryLostInfo() {
        	 
        	 return infoMethod.QueryLost();
         };
         //根据Lost标题进行查询
         public ResultSet SelectLostInfo(Info info) {
        	 
        	 return infoMethod.SelectLost(info); 
         }
         //对Lost题目进行模糊查询
         public ResultSet SelectLostTitle(Info info) {
        	 
        	 return infoMethod.SelectLostTitle(info); 
        	 
         }
         //按时间对Lost结果进行倒序遍历
         public ResultSet SelectLostInfos() {
        	 return infoMethod.SelectLostOrder();
         }
         //根据id对Lost结果进行查询
         public ResultSet SelectLostIds(int ids) {
        	 return infoMethod.SelectLostId(ids);
         }
         
         
         
         //判断是否插入Animal成功。
         public boolean InsertAnimalInfo(Info info){
        	 if(infoMethod.InsertAnimal(info)!=0) {
      		   return true;
      	   }else {
      		   return false;
      	   }
        	 
         }
         //Lost进行全部查询
         public ResultSet QueryAnimalInfo() {
        	 
        	 return infoMethod.QueryAnimal();
         };
         //根据Lost标题进行查询
         public ResultSet SelectAnimalInfo(Info info) {
        	 
        	 return infoMethod.SelectAnimal(info); 
         }
         //对Lost题目进行模糊查询
         public ResultSet SelectAnimalTitle(Info info) {
        	 
        	 return infoMethod.SelectAnimalTitle(info); 
        	 
         }
         //按时间对Lost结果进行倒序遍历
         public ResultSet SelectAnimalInfos() {
        	 return infoMethod.SelectAnimalOrder();
         }
         //根据id对Lost结果进行查询
         public ResultSet SelectAnimalIds(int ids) {
        	 return infoMethod.SelectAnimalId(ids);
         }
}
