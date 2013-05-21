package cn.haohaowo.action;

import com.opensymphony.xwork2.Action;

public class OGNLAction implements Action {

	private ValueObj obj = new ValueObj();
	public String execute() throws Exception {
		
		System.out.println("-----------------");
		
		System.out.println("-----------------");
		return SUCCESS;
	}
	public ValueObj getObj() {
		return obj;
	}
	public void setObj(ValueObj obj) {
		this.obj = obj;
	}

}
