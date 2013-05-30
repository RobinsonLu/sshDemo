package cn.haohaowo.ch8;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

public class MyDecider implements Decider {

	public boolean decide(Object element) throws Exception {
		// TODO Auto-generated method stub
		return ((String)element).toLowerCase().indexOf("java") != -1;
	}

}
