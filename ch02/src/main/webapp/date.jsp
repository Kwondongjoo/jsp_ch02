<%@page import="java.util.GregorianCalendar"%> <!-- //import -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//단독 수행 가능
	GregorianCalendar gc = new GregorianCalendar();
	String date = String.format("%TF %TT", gc,gc);
%>
오늘은 <%=date %> 입니다

</body>
</html>