<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'sortTag.jsp' starting page</title>
    
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
    <h3>使用sort标签对一个列表进行排序</h3>
    <s:bean name="cn.haohaowo.ch8.MyComparator" id="myComparator"></s:bean>
    <s:sort comparator="#myComparator" source="{'《Java Web开发详解》','《VC++深入详解','《Struts2 开发详解》','《Java 无难事》'}">
    	<ol>
    		<s:iterator>
    			<li><s:property/></li>
    		</s:iterator>
    	</ol>
    </s:sort>
  </body>
</html>
