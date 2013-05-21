package cn.haohaowo.ch8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.util.ValueStack;

public class DoubleSelectTagAction implements Action {

	private List<Province> provinces;
	private Map<Province, List<City>> cityMap;
	
	public DoubleSelectTagAction() {
		provinces = new ArrayList<Province>();
		Province province1 = new Province(1, "sichuan province");
		Province province2 = new Province(2, "shandong province");
		provinces.add(province1);
		provinces.add(province2);
		
		cityMap = new HashMap<Province, List<City>>();
		List<City> city1 = new ArrayList<City>();
		List<City> city2 = new ArrayList<City>();
		city1.add(new City(1, "jinan city"));
		city1.add(new City(2, "qingdao city"));
		city2.add(new City(1, "chendou city"));
		city2.add(new City(2, "mianyang city"));
		cityMap.put(province2, city1);
		cityMap.put(province1, city2);
	}
	
	public List<Province> getProvinces() {
		return provinces;
	}
	
	public List<City> getCities() {
		ValueStack stack = ServletActionContext.getValueStack(ServletActionContext.getRequest());
		Object province = stack.findValue("top");
		if(province != null && province instanceof Province) {
			List<City> l = (List<City>)cityMap.get(province);
			return l;
		}
		return Collections.EMPTY_LIST;
	}
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	

}
