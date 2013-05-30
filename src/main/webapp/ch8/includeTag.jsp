<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'includeTag.jsp' starting page</title>
    
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
    <h3>那使用include标签包含jsp1.jsp</h3>
    <s:include value="jsp1.jsp" />
    
    <h3>使用include标签包含jsp2.jsp，使用嵌套的param标签向vjsp2.jsp传说参数</h3>
    <s:include value="jsp2.jsp">
    	<s:param name="name" value="'zhangsan'"/>
    	<s:param name="email" value="'zhangsan@robinson.com'"/>
    </s:include>
  </body>
</html>
