package cn.haohaowo.ch10;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.haohaowo.user.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6948479525199826275L;
	
	private User user;
	private Map<String, Object> session;
	
	public String input() throws Exception {
		return INPUT;
	}
	
	@Override
	public String execute() throws Exception {
		if("lwc".equals(user.getUsername())) {
			session.put("user", user);
			return SUCCESS;
		} else {
			addActionError("logining failed ");
			return INPUT;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
}
