<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'ifTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <h3>根据请求的参数，判断成绩等级</h3>
    <s:set name="score" value="#parameters.score[0]" />
    你的成绩是：
    <s:if test="#score < 60">
    	不及格
    </s:if>
    <s:elseif test="#score >= 60 && #score < 85">
    	及格
    </s:elseif>
    <s:else>
    	优秀
    </s:else>
  </body>
</html>
