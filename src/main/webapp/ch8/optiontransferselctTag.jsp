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
		<s:optiontransferselect 
		label="favorite" leftTitle="java Book" rightTitle="C++ Book" 
		name="javaBook" list="{'java web', 'struts2', 'java'}" 
		headerKey="-1" headerValue="--select--" emptyOption="true"
		doubleName="cBook" doubleList="{'VC++', 'C++ primer', 'C++'}"
		doubleHeaderKey="-1" doubleHeaderValue="----select--" doubleEmptyOption="true"
		addToLeftLabel="left move" addToRightLabel="right move"
		addAllToLeftLabel="all left move" addAllToRightLabel="all right move"
		selectAllLabel="select all" leftUpLabel="up" leftDownLabel="down"
		rightUpLabel="up" rightDownLabel="down"/>
	</s:form>

</body>
</html>