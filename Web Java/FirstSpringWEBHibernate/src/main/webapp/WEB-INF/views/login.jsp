<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="Authuntication" modelAttribute="objUser">
		Username : <form:input path="username"/><br/>
		Password : <form:input path="password"/><br/>
		<form:button >login</form:button>
	</form:form>
</body>
</html>