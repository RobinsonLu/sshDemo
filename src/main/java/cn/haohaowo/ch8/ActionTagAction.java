package cn.haohaowo.ch8;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class ActionTagAction implements Action {

	private String name;
	private String email;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String doDefault(){
		ServletActionContext.getRequest().setAttribute("greeting", "欢迎来到程序员之家");
		return SUCCESS;
	}

}
