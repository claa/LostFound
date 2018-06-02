package nuc.test.Action;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.test.Service.InfoService;
import nuc.test.vo.Info;

public class queryAction extends ActionSupport implements ModelDriven<Info>{
    private Info info=new Info();
    private InfoService infos =new InfoService();
    
    public String queryFound() {
    	ResultSet rs=infos.SelectTitle(info);
    	ActionContext.getContext().getSession().put("query", rs);
			try {
				if(rs.next()) {
				return "queryOk";
                }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   return "queryFail";
    }
	@Override
	public Info getModel() {
		// TODO Auto-generated method stub
		return info;
	}

}
