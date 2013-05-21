package cn.haohaowo.ch10;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1104359541570190561L;

	@Override
	public String intercept(ActionInvocation invo) throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Map<String, Object> session = ctx.getSession();
		Object user = session.get("user");
		if(null == user) {
			ActionSupport action = (ActionSupport) invo.getAction();
			action.addActionError("your must logining ");
			return Action.LOGIN;
		} else {
			return invo.invoke();
		}
	}

}
