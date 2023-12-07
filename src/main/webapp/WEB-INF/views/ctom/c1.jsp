<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>c1.jsp</title>
</head>
<body>
<p><br/></p>
<div class="container">
		<h2>이곳은 c1.jsp파일입니다.</h2>
		<p>view 자원을 관리하는 resources 학습</p>
		<hr/>
		<div><img src="/include/1.png" width="150px" />(x)</div>
		<div><img src="/resources/2.png" width="150px" />(x)</div>
		<div><img src="${ctp}/resources/images/2.png" width="150px" />(o)</div>
		<div><img src="${ctp}/resources/images/3.png" width="150px" />(o)</div>
		<div><img src="${ctp}/resources/images/4.png" width="150px" />(o)</div>
		<div><img src="${ctp}/images/5.png" width="150px" />()</div>
		<div><img src="${ctp}/board/1.png" width="150px" />()</div>
		<div><img src="${ctp}/board/2.png" width="150px" />()</div>
		<div><img src="${ctp}/images/test/3.png" width="150px" />()</div>
		<div><img src="${ctp}/test/3.png" width="150px" />()</div>
		<div><img src="${ctp}/test/4.png" width="150px" />()</div>
</div>
<p><br/></p>
</body>
</html>