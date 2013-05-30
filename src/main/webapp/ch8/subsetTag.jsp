<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'subsetTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <h3>使用subset标签从一个列表中截取一个子集，起始索引为1，截取的元素总数为3</h3>
    <s:subset source="{'one', 'two', 'three', 'four', 'five'}" start="1" count="3">
    	<s:iterator status="status">
    		<s:property/>
    		<s:if test="!#status.last">,</s:if>
    	</s:iterator>
    </s:subset>
    
    <h3>使用decider属性，过滤掉一些你不需要的子集</h3>
    <s:bean name="cn.haohaowo.ch8.MyDecider" id="mydecider"></s:bean>
    <s:subset source="{'《Java Web开发详解》','《VC++深入详解','《Struts2 开发详解》','《Java 无难事》'}"
    	decider="#mydecider">
    		<s:iterator status="status">
    			<s:property/>
    			<s:if test="!#status.last">,</s:if>
    		</s:iterator>
   	</s:subset>
  </body>
</html>
