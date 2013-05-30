package cn.haohaowo.ch13;

import cn.haohaowo.ch11.Student;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5750129904506149748L;
	
	private Student student;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		student = new Student();
		student.setGrade(10);
		return SUCCESS;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
