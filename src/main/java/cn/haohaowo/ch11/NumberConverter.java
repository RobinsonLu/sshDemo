package cn.haohaowo.ch11;

import java.util.Map;

import ognl.DefaultTypeConverter;

public class NumberConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object value, Class toType) {

		if(toType == Long.class) {
			// String convert number
			String strNum = ((String[])value)[0];
			StringBuffer sb = new StringBuffer(strNum);
			
			//delete ","
			int index = sb.indexOf(",");
			while(index > -1) {
				sb.deleteCharAt(index);
				index = sb.indexOf(",");
			}
			
			return Long.parseLong(sb.toString());
		} else if(toType == String.class) {
			// number convert String
			Long num = (Long)value;
			StringBuffer sb = new StringBuffer(num.toString());
			StringBuffer result = new StringBuffer();
			
			//reverse the StringBuffer, appended ","
			sb = sb.reverse();
			String temp = null;
			while(sb.length() > 3) {
				temp = sb.substring(0, 3);
				result.append(temp);
				result.append(",");
				sb.delete(0, 3);
			}
			result.append(sb);
			
			return result.reverse().toString();
		}
		
		return null;
	}
}
