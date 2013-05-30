package cn.haohaowo.ch8;

import org.apache.struts2.util.IteratorGenerator.Converter;

public class MyConverter implements Converter {

	public Object convert(String token) throws Exception {
		// TODO Auto-generated method stub
		return "student: " + token;
	}

}
