<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Insert title here</title>
</head>
<body>
	<h3>action error</h3>
	<s:actionerror/>
	<h3>action message</h3>
	<s:actionmessage/>
	<h3>field error</h3>
	<s:fielderror/>
	<h3>the id field error</h3>
	<s:fielderror>
		<s:param value="'field1'"></s:param>
	</s:fielderror>
</body>
</html>