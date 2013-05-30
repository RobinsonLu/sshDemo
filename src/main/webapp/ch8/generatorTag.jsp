<%@ page language="java"  pageEncoding="utf-8"%>
<%@page import="java.util.Iterator"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'generatorTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <h3>使用generator标签拆分一个字符串，生产迭代器对拆分的子串进行迭代</h3>
    <s:generator separator=", " val="'zhangsan, lisi, wangwu'">
    	<s:iterator>
    		<s:property/><br/>
    	</s:iterator>
    </s:generator>
    
    <h3>使用count属性指定生成的迭代器中可用的元素的数量</h3>
    <s:generator separator=", " val="'zhangsan, lisi, wangwu'" count="2">
    	<s:iterator>
    		<s:property/><br/>
    	</s:iterator>
    </s:generator>
    
    <h3>使用ID属性，将生成的迭代器保存到pageContext对象中</h3>
    <s:generator separator="," val="'zhangsan,lisi,wangwu'" id="name"></s:generator>
    <%--
    	Iterator it = (Iterator) pageContext.getAttribute("name");
    	while(it.hasNext()){
    		String name = (String) it.next();
    		out.println(name+ "<br/>");
    	} 
    --%>
    
    <h3>使用converter属性，转换拆分后的子串</h3>
    <s:bean name="cn.haohaowo.ch8.MyConverter" id="myConverter"></s:bean>
    <s:generator separator="," val="'zhangsan,lisi,wangwu'" converter="#myConverter">
    	<s:iterator>
    		<s:property/><br/>
    	</s:iterator>
    </s:generator>
  </body>
</html>
