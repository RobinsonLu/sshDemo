<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'beanTag.jsp' starting page</title>
    
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
  	<h3>没有指定Id属性，Bean标签创建的User对象被放到值栈的顶部</h3>
    <s:bean name="cn.haohaowo.user.User">
    	<s:param name="name" value="'zhangsan'"/>
    	<s:param name="email" value="'zhangsan@robinson.com'"/>
    	用户名：<s:property value="name"/><br/>
    	邮箱：<s:property value="email"/>
    </s:bean>
    
    <p>
    	用户名：<s:property value="name"/><br/>
    	邮箱：<s:property value="email"/>
    </p>
    
    <h3>指定Id属性，Bean标签创建的User对象被放到值栈的顶部和OgnlContext中</h3>
    <s:bean name="cn.haohaowo.user.User" id="user">
    	<s:param name="name" value="'zhangsan'"/>
    	<s:param name="email" value="'zhangsan@robinson.com'"/>
    	用户名：<s:property value="name"/><br/>
    	邮箱：<s:property value="email"/>
    </s:bean>
    
    <p>
    	用户名：<s:property value="#user.name"/><br/>
    	邮箱：<s:property value="#user.email"/>
    </p>
  </body>
</html>
