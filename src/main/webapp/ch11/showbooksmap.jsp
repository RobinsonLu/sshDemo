<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>show books</title>
	</head>
	<body>
		<table border="1">
			<caption>your books list:</caption>
			<tr>
				<th>book name</th>
				<th>book price</th>
				<th>book amout</th>
			</tr>
			<s:iterator value="books">
				<tr>
					<td><s:property value="value.title"></s:property></td>
					<td><s:property value="value.price"></s:property></td>
					<td><s:property value="value.amount"></s:property></td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>