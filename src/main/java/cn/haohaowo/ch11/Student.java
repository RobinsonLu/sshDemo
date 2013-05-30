package cn.haohaowo.ch11;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7763220258615505516L;
	
	private String name;
	private int age;
	private Date birthday;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

	
}
