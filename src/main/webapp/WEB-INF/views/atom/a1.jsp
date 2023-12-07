<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>a1.jsp</title>
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 a1.jsp 입니다.</h2>
	<div>넘어온 값 : ${data}</div>	
	<hr/>
	<div><a href="${ctp}/">홈으로</a></div>
	<!-- 값을 줌 -->
	<!-- <a href="${ctp}/"></a> Controller 부분 중에서 @RequestMapping(value = "/") 보고 HomeController로 데이터가 이동됨  -->
	<div><a href="${ctp}/atom/a2">a2</a></div>
	<!-- ${ctp}/atom/a2의 값을 Controller로 넘겨주고 Controller는 @RequestMapping의 해당 value 값을 찾는다. -->
	<div><a href="${ctp}/atom/a3">a3</a></div>
	<hr/>
	<h2>넘어온 이름 : ${name}</h2>
	<h3> 성별 : ${gender}</h3>		
</div>
<p><br/></p>
</body>
</html>