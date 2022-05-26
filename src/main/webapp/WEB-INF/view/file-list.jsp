<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hola esto es JSP en java SubemeApp</h2>
	
	<c:forEach var="data" items="${fileList}">
		<p>${data}</p>
	</c:forEach>
</body>
</html>