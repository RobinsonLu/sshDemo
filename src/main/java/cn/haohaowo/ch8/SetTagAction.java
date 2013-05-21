package cn.haohaowo.ch8;


import cn.haohaowo.user.User;

import com.opensymphony.xwork2.Action;

public class SetTagAction implements Action {

	private User user;
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		user = new User();
		user.setUsername("zhangsan");
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	
}
