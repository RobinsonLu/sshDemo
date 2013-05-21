package cn.haohaowo.action;

import cn.haohaowo.user.User;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 5113367222328119404L;
	
	private User user;
	
	@Override
	public String execute() throws Exception {
		
		if(null != user && (null != user.getUsername() || null != user.getSex())){
			return this.SUCCESS;
		}else{
			return this.INPUT;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
