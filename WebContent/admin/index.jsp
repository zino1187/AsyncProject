<%@page import="com.itbank.model.domain.Admin"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	Admin admin=(Admin)request.getSession().getAttribute("admin");
	out.print(admin);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
관리자 모드 메인 페이지 입니다
</body>
</html>