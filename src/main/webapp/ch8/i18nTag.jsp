<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'i18nTag.jsp' starting page</title>
    
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
    <h3>使用I18n标签将ApplicationResources资源包压入值栈，使用嵌套的text标签获取本地化的消息</h3>
    <s:i18n name="ApplicationResources">
    	用户名：<s:text name="name" /><br/>
    	邮箱：<s:text name="email" /><br/>
    </s:i18n>
    
    <h3>直接使用text标签，从资源包基名与Action类名相同的资源包中获取本地化的信息</h3>
    用户名：<s:text name="name" /><br/>
    邮箱：<s:text name="email" /><br/>
    
    <% pageContext.setAttribute("now", new Date()); %>
    <h3>使用嵌套的param标签为消息文本中参数设值，第一个param标签为{0}设值，第二个为{1}设值</h3>
    <s:text name="now">
    	<s:param value="#attr.now" />
    	<s:param value="'lisi'" />
    </s:text>
  </body>
</html>
