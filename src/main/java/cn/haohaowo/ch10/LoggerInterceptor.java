package cn.haohaowo.ch10;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class LoggerInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4547200444803958672L;

	@Override
	public String intercept(ActionInvocation invo) throws Exception {
		invo.addPreResultListener(new PreResultListener() {
			
			public void beforeResult(ActionInvocation invocation, String resultCode) {
				System.out.println("step 3 beforeReult execute, action executed, Result will executing.");
			}
		});
		System.out.println("step 1 action and result aren't execute.");
		String resultCode = invo.invoke();
		System.out.println("step 4 action and result are executed, the control returnback to LoggerInterceptor.");
		return resultCode;
	}

}
