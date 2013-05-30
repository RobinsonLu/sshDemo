package cn.haohaowo.ch11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateTypeConverter extends StrutsTypeConverter {

	private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
	
	@Override
	public Object convertFromString(Map content, String[] values, Class toClass) {
		// String convert Date
		try {
			return sf.parse(values[0]);
		} catch(ParseException e) {
			throw new TypeConversionException(e.getMessage() + " [ " + values + " - class: " + toClass + " ]");
		}
	}

	@Override
	public String convertToString(Map content, Object o) {
		// Date convert String
		return sf.format(o);
	}

}
