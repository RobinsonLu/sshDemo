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

	<s:form>
		<s:combobox label="selct message" name="channel" list="{'paper', 'web', 'friend'}"
		headerKey="-1" headerValue="-----------select -----" emptyOption="true"/>
	</s:form>

</body>
</html>