<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>add books</title>
	</head>
	<body>
		<s:form action="/conversion/bookConfirmActionLowver5" theme="simple">
			<table>
				<tr>
					<th>book name</th>
					<th>book price</th>
					<th>book amout</th>
				</tr>
				<s:iterator value="new int[3]" status="status">
					<tr>
						<td><s:textfield name="%{'books[' + #status.index + '].title'}"></s:textfield></td>
						<td><s:textfield name="%{'books[' + #status.index + '].price'}"></s:textfield></td>
						<td><s:textfield name="%{'books[' + #status.index + '].amount'}"></s:textfield></td>
					</tr>
				</s:iterator>
				<tr>
					<td colspan="3"><s:submit value="submit"></s:submit></td>
				</tr>
			</table>
		</s:form>
	</body>
</html>