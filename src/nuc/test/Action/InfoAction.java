package nuc.test.Action;

import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.test.Service.InfoService;
import nuc.test.vo.Info;

public class InfoAction extends ActionSupport implements ModelDriven<Info>{
    private Info info=new Info();
    private InfoService infoS =new InfoService();
    
    public String foundInfo(){
    	if(infoS.InsertInfo(info)){
    		return "foundOk";
    	}else{
    		
    		ActionContext.getContext().put("error","提交失败");
    		return ERROR;
    	}
    	
    }
    
    public String lostInfo(){
    	if(infoS.InsertLostInfo(info)){
    		return "lostOk";
    	}else{
    	
    		ActionContext.getContext().put("error","提交失败");
    		return ERROR;
    	}
    	
    }
    public String animalInfo(){
    	if(infoS.InsertAnimalInfo(info)){
    		return "animalOk";
    	}else{
    		
    		ActionContext.getContext().put("error","提交失败");
    		return ERROR;
    	}
    	
    }
    
	@Override
	public Info getModel() {
		// TODO Auto-generated method stub
		return info;
	}
	

}
