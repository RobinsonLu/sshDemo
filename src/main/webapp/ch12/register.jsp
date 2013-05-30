<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title><s:text name="title"></s:text></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<s:head/>
	<s:fielderror></s:fielderror>

  </head>
  
  <body>
  	<s:set name="current_locale" value="#session['WW_TRANS_I18N_LOCAL'] == null ? locale : #session['WW_TRANS_I18N_LOCAL']"></s:set>
  	<s:url id="chinese_url" value="/validator/register!default">
  		<s:param name="request_locale" value="@java.util.Locale@CHINA"></s:param>
  	</s:url>
  	<s:url id="english_url" value="/validator/register!default">
  		<s:param name="request_locale" value="@java.util.Locale@ENGLISH"></s:param>
  	</s:url>
  	<s:if test="#current_local.equals(@java.util.Local@CHINA)">
  		<s:a href="%{#chinese_url}">
  			<strong><s:text name="%{getText('chinese')}"/></strong>
  		</s:a>
  		<s:a href="%{#english_url}">
  			<s:text name="%{getText('english')}"/>
  		</s:a>
  	</s:if>
  	<s:else>
  		<s:a href="%{#chinese_url}">
  			<s:text name="%{getText('chinese')}"/>
  		</s:a>
  		<s:a href="%{#english_url}">
  			<strong><s:text name="%{getText('english')}"/></strong>
  		</s:a>
  	</s:else>
    <s:form method="post" action="/validator/register">
    	<s:textfield name="user.username" key="username" required="true"></s:textfield>
    	<s:textfield name="user.password" key="password" required="true"></s:textfield>
    	<s:textfield name="verifyPassword" key="verifyPassword" equired="true"></s:textfield>
    	<s:radio list="#{true : getText('sex.male'), false : getText('sex.female')}"
    	name="user.sex" value="true" key="sex"></s:radio>
    	<s:textfield name="user.email" key="email"></s:textfield>
    	<s:textfield name="user.pwdQuestion" key="pwdQuestion"></s:textfield>
    	<s:textfield name="user.pwdAnswer" key="pwdAnswer"></s:textfield>
    	
    	<tr>
    		<td><label for="register_validationCode"><s:text name="register_validationCode"></s:text></label></td>
    		<td>
    			<s:textfield name="validationCode" theme="simple"></s:textfield>
    			<img src="<s:url action='validationCode' />"/>
    		</td>
    	</tr>
    	<tr>
			<td><s:submit value="%{getText('submit')}" theme="simple"/></td>
			<td><s:submit value="%{getText('reset')}" theme="simple"/></td>
		</tr>
    </s:form>
  </body>
</html>
