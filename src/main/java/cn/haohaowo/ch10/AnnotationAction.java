package cn.haohaowo.ch10;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.opensymphony.xwork2.interceptor.annotations.BeforeResult;

public class AnnotationAction implements Action {

	public String execute() throws Exception {
		System.out.println("execute");
		return SUCCESS;
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeResult
	public void beforeResult() {
		System.out.println("beforeResult");
	}
}
