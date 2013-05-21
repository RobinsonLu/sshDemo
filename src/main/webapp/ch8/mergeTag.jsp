<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'mergeTag.jsp' starting page</title>
    
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
    <h3>将多个列表组合在一起进行迭代</h3>
    <s:append id="myAppendIterator">
    	<s:param value="{'《Java WEB开发详解》', '《VC++深入详解》'}"/>
    	<s:param value="{'《Struts2 开发详解》', '《Java无难事》'}"/>
    	<s:param value="{'《Hibernate 深入详解》', '《Spring开发详解》'}"/>
    </s:append>
    <table border="1">
	    <s:iterator value="#myAppendIterator" status="status">
	    	<tr style="
	    	<s:if test="#status.odd">background-color:#aaaaaa</s:if>
	    	<s:else>background-color:#ffaaff</s:else>">
	    		<td><s:property/></td>
	    	</tr>
	    </s:iterator>
    </table>
  </body>
</html>
