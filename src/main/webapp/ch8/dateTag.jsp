<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'dateTag.jsp' starting page</title>
    
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
    <%
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 
    		calendar.get(Calendar.DATE) + 10);
   		pageContext.setAttribute("futureDate", calendar.getTime());
     %>
     
     <h3>制定format=“yyyy年MM月dd日”</h3>
     <s:date name="#attr.futureDate" format="yyyy年MM月dd日" />
     
     <h3>没有使用format属性，制定nice=“true”</h3>
     <s:date name="#attr.futurnDate" nice="true" />
     
     <h3>没有使用format和nice属性，将以资源包中struts.date.format的键值作为格式化样式</h3>
     <s:date name="#attr.futureDate" />
  </body>
</html>
