package cn.haohaowo.ch12;

import cn.haohaowo.user.User;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4175175976267328751L;
	
	private User user;
	
	private String verifyPassword;
	
	private String validationCode;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	@Override
	public String doDefault() throws Exception {
		// default method
		return INPUT;
	}
	
	@Override
	public String execute() throws Exception {
		// execute method
		if(user.getUsername().equals("lwc")) {
			return SUCCESS;
		}
		
		return INPUT;
	}

	public String getValidationCode() {
		return validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

}
