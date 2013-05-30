package cn.haohaowo.ch10;

import com.opensymphony.xwork2.Action;

public class TestAction implements Action {

	public String execute() throws Exception {
		System.out.println("step 2 action execute");
		return SUCCESS;
	}

}
