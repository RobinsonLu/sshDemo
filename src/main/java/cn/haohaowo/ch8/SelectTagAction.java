package cn.haohaowo.ch8;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SelectTagAction extends ActionSupport {

	private List<Education> educations;

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public SelectTagAction(){
		educations = new ArrayList<Education>();
		educations.add(new Education(1, "����"));
		educations.add(new Education(2, "��ѧ"));
		educations.add(new Education(3, "˶ʿ"));
		educations.add(new Education(4, "��ʿ"));
	}
}
