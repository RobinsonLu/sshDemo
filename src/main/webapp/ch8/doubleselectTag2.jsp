<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<s:form>
		<s:doubleselect label="please select city" name="province" list="provinces" listKey="id" listValue="name" 
		doubleName="city" doubleList="cities"  doubleListKey="id" doubleListValue="name" 
		headerKey="-1" headerValue="------select-------" emptyOption="true"/>
	</s:form>

</body>
</html>