package cn.haohaowo.ognl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class OgnlAction implements Action, ParameterAware, RequestAware,
		SessionAware, ApplicationAware {
	private Map parameters;
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	private List<Employee> emps = new ArrayList<Employee>();
	
	public void initEmps(){
		Address address1 = new Address("中国","北京","海淀");
		Address address2 = new Address("中国","上海","虹口");
		Address address3 = new Address("中国","湖北","武汉");
		
		String[] emails1 = new String[]{"zhangsan@sina.com","zhangsan@163.com"};
		String[] emails2 = new String[]{"lisi@sina.com","lisi@163.com"};
		String[] emails3 = new String[]{"wangwu@sina.com","wangwu@163.com"};
		
		Map<String,String> accounts1 = new HashMap<String, String>();
		accounts1.put("建行", "123456");
		accounts1.put("农行", "123567");
		Map<String,String> accounts2 = new HashMap<String, String>();
		accounts2.put("建行", "156");
		accounts2.put("农行", "12345");
		Map<String,String> accounts3 = new HashMap<String, String>();
		accounts3.put("建行", "1456");
		accounts3.put("农行", "124567");
		
		Employee emp1 = new Employee("张三",30,1900f,address1,emails1,accounts1);
		Employee emp2 = new Employee("李四",32,2000f,address2,emails2,accounts2);
		Employee emp3 = new Employee("王五",34,1300f,address3,emails3,accounts3);
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
	}


	public List<Employee> getEmps() {
		return emps;
	}


	public String execute() throws Exception {
		this.initEmps();
		this.parameters.put("greeting", "Welcome java home");
		this.request.put("empName", emps.get(0).getName());
		this.session.put("empName", emps.get(1).getName());
		this.application.put("empName", emps.get(2).getName());
		
		return this.SUCCESS;
	}


	public void setParameters(Map parameters) {
		this.parameters = parameters;
	}


	public void setRequest(Map<String, Object> request) {

		this.request = request;
	}


	public void setSession(Map<String, Object> session) {

		this.session = session;
	}


	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	
	

}
