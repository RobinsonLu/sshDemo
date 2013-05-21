<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'pushTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h3>普通访问方式</h3>
    姓名：<s:property value="#session.user.name"/><br/>
    性别：<s:property value="#session.user.sex"/><br/>
    邮箱：<s:property value="#session.user.email"/>
    
    <h3>使用push标签后的简化方式</h3>
    <s:push value="#session.user">
    	姓名：<s:property value="name"/><br/>
	    性别：<s:property value="sex"/><br/>
	    邮箱：<s:property value="email"/>
    </s:push>
  </body>
</html>
