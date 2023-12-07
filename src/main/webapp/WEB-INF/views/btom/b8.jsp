<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>b8.jsp</title>
	
</head>
<body>
<p><br/></p>
<div class="container">
		<h2>이곳은 btom폴더의 b8.jsp입니다.</h2>
		<hr/>
		<p>
			<a href="${ctp}/" class="btn btn-warning">Home으로</a>
			<a href="${ctp}/ctom/c1" class="btn btn-warning">c1으로</a>
			<a href="${ctp}/ctom/c2" class="btn btn-warning">c2으로</a>
		</p>
</div>
<p><br/></p>
</body>
</html>