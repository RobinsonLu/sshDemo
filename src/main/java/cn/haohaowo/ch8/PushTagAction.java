package cn.haohaowo.ch8;


import cn.haohaowo.user.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class PushTagAction implements Action {

	private User user;
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		user = new User();
		user.setUsername("zhangsan");
		user.setSex("male");
		user.setEmail("zhangsan@robinson.org");
		ActionContext.getContext().getSession().put("user", user);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
