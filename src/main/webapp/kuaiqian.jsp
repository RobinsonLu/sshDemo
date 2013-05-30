<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="https://www.99bill.com/webapp/receiveMerchantInfoAction.do">
		商户名称:<input type="text" name="merchant_id" value="">
		订单编号:<input type="text" name="orderid" value="">
		金额:<input type="text" name="amount" value="">
		<input type="hidden" name="isSupportDES" value="1">
		<input type="submit" value="提交">
	</form>

</body>
</html>