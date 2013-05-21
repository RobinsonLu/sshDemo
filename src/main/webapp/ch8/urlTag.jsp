<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'urlTag.jsp' starting page</title>
    
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
    <h3>使用当前页面的URL生成URL</h3>
    <s:url/><br/>
    <s:url action="pushTag" namespace="strutsTag"/><br/>
    
    <h3>使用forceAddSchemeHostAndPort属性加强添加scheme,主机和端口</h3>
    <s:url action="pushTag" forceAddSchemeHostAndPort="true"/><br/>
    
    <h3>将includeParams属性设为none，使用嵌套的param标签附加请求参数</h3>
    <s:url action="pushTag" includeParams="none">
    	<s:param name="page" value="1"/><br/>
    </s:url>
    <h3>使用嵌套param标签覆盖原始的数据</h3>
    <s:url action="pushTag" includeParams="none">
    	<s:param name="id" value="88"/><br/>
    	<s:param name="page" value="1"/><br/>
    </s:url>
    
    <h3>使用id属性和escapAmp属性，在url标签结束后使用property标签输出生成URL</h3>
    <s:url value="pushTag.action" id="urlTag" escapeAmp="false">
    	<s:param name="id" value="88"/><br/>
    	<s:param name="page" value="1"/><br/>
    </s:url>
    <s:property value="#urlTag"/>
  </body>
</html>
