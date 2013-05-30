package cn.haohaowo.ch8;

import java.util.Comparator;

public class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = (String) o1;
		String str2 = (String) o2;
		return str1.compareTo(str2);
	}

}
