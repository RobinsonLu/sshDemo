<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>student register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<s:head/>
  	<s:fielderror></s:fielderror>
  </head>
  
  <body>
  	<s:form method="post" action="/conversion/register">
  		<s:textfield name="student.name" label="name"></s:textfield>
  		<s:textfield name="student.age" label="age"></s:textfield>
  		<s:textfield name="student.birthday" label="birthday"></s:textfield>
  		<s:submit value="submit"></s:submit>
  	</s:form>
    
  </body>
</html>
