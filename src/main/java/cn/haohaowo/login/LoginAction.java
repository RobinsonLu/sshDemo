package cn.haohaowo.login;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.haohaowo.entity.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private Map session;
	
	private static Map<String, User> users = new HashMap<String, User>();
	private User user;
	
	static{
//		users.put("zhangsan", new User("zhangsan","1111"));
//		users.put("luwancai", new User("luwancai163","222"));
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setSession(Map<String, Object> session) {

		this.session = session;
	}
	
	@Override
	public String execute() throws Exception {

		if(null!=user && null!=user.getName()){
			User user = users.get(getUser().getName());
			if(null!=user && null!=user.getPassword() && 
					user.getPassword().equals(getUser().getPassword())){
				session.put("login",user);
				return "ok";
			}else{
				return "fail";
			}
		}else{
			return "fail";
		}
	}

}
