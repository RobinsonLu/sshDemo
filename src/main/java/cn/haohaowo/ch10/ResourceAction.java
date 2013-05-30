package cn.haohaowo.ch10;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.Before;

public class ResourceAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5343212006025786229L;
	
	private Map<String, Object> session;
	
	@Before
	public String authenticate() {
		Object user = session.get("user");
		if(null == user) {
			addActionError("your must logining ");
			return Action.LOGIN;
		} else {
			return null;
		}
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
