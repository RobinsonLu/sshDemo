package cn.haohaowo.interceptor;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AuthenticationInterceptor implements Interceptor,SessionAware {

	private static final long serialVersionUID = 3613071590128176991L;
	
	private Map session;

	public void destroy() {
		System.out.println("--------AuthenticationInterceptor destory--------");

	}

	public void init() {
		System.out.println("--------AuthenticationInterceptor init--------");

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("---------invocation start-------------");
		
		ActionContext context = invocation.getInvocationContext();
		
		ValueStack valueStack = invocation.getStack();
		
		ActionProxy actionProxy = invocation.getProxy();
		
		String actionname = actionProxy.getActionName();
		
		System.out.println("Action Name :"+actionname);
		System.out.println("Method :"+actionProxy.getMethod());
		System.out.println("---------invocation end-------------");
		
		if("login".equals(actionname) && null != session)
		{
//			session.clear();
			return invocation.invoke();
		}else{
			return "fail";
		}
		
		
		
		
	}

	public void setSession(Map<String, Object> session) {
		
		this.session = session;
		
	}

}
