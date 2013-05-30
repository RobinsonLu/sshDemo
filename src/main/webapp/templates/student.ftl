<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>freemarker if</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <#if student?exists>
	<#assign x = (student.grade!'0')?number />
	<#if (x >= 0 && x < 60)>
		中文
	<#elseif (x >= 60 && x < 85)>
		2
	<#elseif (x >=85 && x <= 100)>
		3
	<#else>
		不一个有效的成绩
	</#if>
	<#else>
	111111111111111111
	</#if>
  </body>
</html>


