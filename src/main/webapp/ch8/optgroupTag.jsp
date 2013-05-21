<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'optgroupTag.jsp' starting page</title>
    
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
    <s:form>
    	<s:select list="#{1:'《window核心编程》',2:'《深入理解计算机系统》'}" label="请选择图书">
    		<s:optgroup label="C/C++图书" list="#{3:'《VC++深入了解》',4:'《C++ Primer》'}"></s:optgroup>
    		<s:optgroup label="Java图书" list="#{5:'《Java Web 开发详解》',6:'《Struts2 深入了解》'}"></s:optgroup>
    	</s:select>
    </s:form>
  </body>
</html>
