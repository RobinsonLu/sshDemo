<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'actionTag.jsp' starting page</title>
    
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
    <h3>执行结果，并将结果页面的输出到包含到本页面</h3>
    <s:action name="actionTag" executeResult="true" namespace="/strutstag"/>
    
    <h3>不执行结果，调用ActionTagAction中doDefault方法，获得请求对象的greeting</h3>
    <s:action name="actionTag!default" executeResult="false" namespace="/strutstag"/>
    <s:property value="#attr.greeting"/>
    
    <h3>执行结果，并通过嵌套的param标签，设置ActionTagAction的name和email</h3>
    <s:action name="actionTag" executeResult="true" namespace="/strutstag">
    	<s:param name="name" value="'zhangsan'"/>
    	<s:param name="email" value="'zhangsan@robinson.com'"/>
    </s:action>
  </body>
</html>
