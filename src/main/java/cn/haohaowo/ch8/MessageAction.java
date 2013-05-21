package cn.haohaowo.ch8;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8044551659394286101L;
	public String  execute() throws Exception {
		addActionError("Action Error Message1");
		addActionError("Action Error Message2");
		
		addActionMessage("Action Message1");
		addActionMessage("Action Message2");
		
		addFieldError("field1", "feild error1");
		addFieldError("field2", "feild error2");
		
		return SUCCESS;
	}
}
