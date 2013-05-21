<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Logining Page</title>
	<s:head/>
	</head>
	<body>
	<s:form action="/inter/login">
		<s:actionerror/>
		<s:textfield name="user.name" label="login name"></s:textfield>
		<s:password name="user.password" label="password"></s:password>
		<s:submit value="submit"></s:submit>
	</s:form>
	</body>
</html>