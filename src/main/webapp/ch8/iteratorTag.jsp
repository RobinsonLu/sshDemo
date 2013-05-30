<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'iteratorTag.jsp' starting page</title>
    
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
  	<h3>迭代列表，不使用status属性</h3>
    <s:iterator value="{'zhangsan', 'lisi', 'wangwu'}">
    	<s:property/>
    </s:iterator>
    
    <h3>迭代列表，使用status属性</h3>
    <table border="1">
    	<tr>
    		<th>当前元素</th>
    		<th>当前迭代的元素的总数</th>
    		<th>当前迭代的元素的索引</th>
    		<th>当前迭代的元素是否是偶数</th>
    		<th>当前迭代的元素是否是奇数</th>
    		<th>当前迭代的元素是否是第一个元素</th>
    		<th>当前迭代的元素是否是最后一个元素</th>
    	</tr>
    	<s:iterator value="{'zhangsan', 'lisi', 'wangwu'}" status="status">
	    	<tr>
	    		<td><s:property/></td>
	    		<td><s:property value="#status.count"/></td>
	    		<td><s:property value="#status.index"/></td>
	    		<td><s:property value="#status.even"/></td>
	    		<td><s:property value="#status.odd"/></td>
	    		<td><s:property value="#status.first"/></td>
	    		<td><s:property value="#status.last"/></td>
	    	</tr>
    	</s:iterator>
    </table>
    
    <h3>迭代Map，不使用status属性</h3>
    <s:iterator value="#{'first':'zhangsan', 'second':'lisi', 'third':'wangwu'}">
    	<s:property value="key"/>===<s:property value="value"/><br/>
    </s:iterator>
  </body>
</html>
