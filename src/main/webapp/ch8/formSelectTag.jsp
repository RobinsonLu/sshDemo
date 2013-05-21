<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'formSelectTag.jsp' starting page</title>
    
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
    	<div>
	    	<h3>使用name和list，list是一个列表</h3>
	    	<s:select list="{'高中','大学','硕士','博士'}" name="education" 
	    	label="最高学历">
	    	</s:select>
    	</div>
    	<div>
	    	<h3>使用name和list，list是一个Map</h3>
	    	<s:select list="#{1:'高中',2:'大学',3:'硕士',4:'博士'}" name="education" 
	    	label="最高学历">
	    	</s:select>
    	</div>
    	<div>
    		<h3>使用headerKey和headerValue</h3>
    		<s:select list="{'高中','大学','硕士','博士'}" name="education" 
    		label="最高学历" headerKey="-1" headerValue="请选择你的学历">
    		</s:select>
   		</div>
   		<div>
   			<h3>使用emptyOption</h3>
   			<s:select list="{'高中','大学','硕士','博士'}" name="education" 
    		label="最高学历" headerKey="-1" headerValue="请选择你的学历" emptyOption="true">
    		</s:select>
   		</div>
   		<div>
   			<h3>使用multiple</h3>
   			<s:select list="{'高中','大学','硕士','博士'}" name="education" multiple="true"
    		label="最高学历" headerKey="-1" headerValue="请选择你的学历" emptyOption="true">
    		</s:select>
   		</div>
   		<div>
   			<h3>使用size</h3>
   			<s:select list="{'高中','大学','硕士','博士'}" name="education" multiple="true"
    		label="最高学历" headerKey="-1" headerValue="请选择你的学历" emptyOption="true"
    		size="8">
    		</s:select>
   		</div>
    </s:form>
  </body>
</html>
