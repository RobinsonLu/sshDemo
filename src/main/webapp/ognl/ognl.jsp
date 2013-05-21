<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>OGNL 表达式</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  	<table border="1">
  		<caption>
  			<strong>访问 request，parameters，session，application，attr</strong>
  		</caption>
  		<tr>
  			<th>OGNL表达式</th>
  			<th>Java代码</th>
  			<th>执行结果</th>
  		</tr>
  		<tr>
  			<td>#parameters.greeting</td>
  			<td>ActionContext.getContext().getParameters().get("greeting")</td>
  			<td><s:property value="#parameters.greeting" /></td>
  		</tr>
  		<tr>
  			<td>#request.empName</td>
  			<td>((Map)ActionContext.getContext().get("request)).get("empName")</td>
  			<td><s:property value="#request.empName"/></td>
  		</tr>
  		<tr>
  			<td>#session.empName</td>
  			<td>ActionContext.getContext().getsesson().get("empName")</td>
  			<td><s:property value="#session.empName"/></td>
  		</tr>
  		<tr>
  			<td>#application.empName</td>
  			<td>ActionConext.getContext().getApplication().get("empName")</td>
  			<td><s:property value="#application.empName"/></td>
  		</tr>
  		<tr>
  			<td>#attr.empName</td>
  			<td>((Map)ActionContext.getContext().get("attr")).get("empName")</td>
  			<td><s:property value="#attr.empName"/></td>
  		</tr>
  	</table>
  	
  	<table border="1">
  		<caption>
  			<strong>访问列表</strong>
  		</caption>
  		<tr>
  			<th>OGNL表达式</th>
  			<th>java代码</th>
  			<th>执行结果</th>
  		</tr>
  		<tr>
  			<td>emps[0].name</td>
  			<td>
  			((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(0).geAddress()
  			</td>
  			<td><s:property value="emps[0].name"/></td>
  		</tr>
  		<tr>
  			<td>emps[1].address</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(1).geAddress()</td>
  			<td><s:property value="emps[1].address"/></td>
  		</tr>
  		<tr>
  			<td>emps[2].address.city</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(2).geAddress().getCity()</td>
  			<td><s:property value="emps[2].address.city"/></td>
  		</tr>
  		<tr>
  			<td>emps.size()</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().size()</td>
  			<td><s:property value="emps.size"/></td>
  		</tr>
  		<tr>
  			<td>emps.isEmpty</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().isEmpty()</td>
  			<td><s:property value="emps.isEmpty"/></td>
  		</tr>
  	</table>
  	
  	<table border="1">
  		<caption><strong>访问数组</strong></caption>
  		<tr>
  			<th>OGNL表达式</th>
  			<th>java代码</th>
  			<th>执行结果</th>
  		</tr>
  		<tr>
  			<td>emps[0].emails[0]</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(0).getEmails()[0]</td>
  			<td><s:property value="emps[0].emails[0]"/></td>
  		</tr>
  		<tr>
  			<td>emps[1].emails[1]</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(1).getEmails()[1]</td>
  			<td><s:property value="emps[1].emails[1]"/></td>
  		</tr>
  	</table>
  	
  	<table border="1">
  		<caption><strong>访问Map</strong></caption>
  		<tr>
  			<th>OGNL表达式</th>
  			<th>java代码</th>
  			<th>执行结果</th>
  		</tr>
  		<tr>
  			<td>emps[0].accounts['建行']</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(0).getAccounts().get("建行")</td>
  			<td><s:property value="emps[0].accounts['建行']"/></td>
  		</tr>
  		<tr>
  			<td>emps[1].accounts.农行</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(1).getAccounts().get("农行")</td>
  			<td><s:property value="emps[1].accounts.农行"/></td>
  		</tr>
  		<tr>
  			<td>emps[2].accounts.size()</td>
  			<td>((OgnlAction)ActionContext.getContext().getValueStack().peek()).getEmps().get(1).getAccounts().size()</td>
  			<td><s:property value="emps[2].accounts.size"/></td>
  		</tr>
  	</table>
  
  </body>
</html>
