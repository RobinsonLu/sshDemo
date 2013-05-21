package cn.haohaowo.ch2;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

	private String message;
	
	public String execute() throws Exception {
		message = "HelloWorld!!!!";
		return SUCCESS;
	}

	public String getMessage(){
		return message;
	}
}
