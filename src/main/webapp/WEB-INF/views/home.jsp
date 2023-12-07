<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% pageContext.setAttribute("name2", "홍길동"); %>
<!-- pageContext : 값을 저장하는 객체 -->

<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>Home</title>
	<jsp:include page="/include/bs4.jsp" />
</head>
<body>
<div class="container">
	<h1>
		Hello world!  
	</h1>
	<P>  현재 서버 시간 : ${serverTime}. </P>
	<hr/>
	<p style="text-align:center">
		<a href="${ctp}/atom/a1?name=${name1}">a1.jsp(/a1)</a>
		<!-- 같은 폴더로 이동할 때 /atom/는 필요없음 , 안적어도 됨 -->
		<!-- ${ctp}/atom/a1 -->
		<a href="${ctp}/atom/atom1?name=${name2}">a1.jsp(/atom.jsp)</a>
		<!-- / 빼먹으면 404 errorpage 생성됨 -->
		<a href="${ctp}/atom/a2?name=${name1}">a2.jsp</a>
		<a href="${ctp}/atom/a3?name=${name2}">a3.jsp</a>
	</p>	
	<div>
		<form name="myform" method="post" action="${ctp}/aCheck">
			<div>나이 : 
				<input type="number" name="age" value="20" min="0" max="99"/>
				<input type="submit" value="나이체크" />
				<input type="button" value="다시부르기" onclick="location.href='${ctp}/';"/>
			</div>
		</form>
	</div>
	<hr/>	
	<div>
		<c:if test="${!empty age}">넘어온 나이는? ${age}
		넘어온 나이 : ${age}<br/>
		<a href="${ctp}/atom/${url}">이동하기</a>
		</c:if>
	</div>
  <hr/>
  <p>
  	<a href="${ctp}/btom/b1" class="btn btn-success">b1 호출</a>
  	<a href="${ctp}/btom/b2" class="btn btn-primary">b2 호출</a>
  	<a href="${ctp}/btom/b3" class="btn btn-success">b3 호출</a>
  	<a href="${ctp}/btom/b4" class="btn btn-primary">b4 호출</a>
  	<a href="${ctp}/btom/b5" class="btn btn-success">b5 호출</a>
  	<a href="${ctp}/btom/b6" class="btn btn-primary">b6 호출</a>
  	<a href="${ctp}/btom/b7" class="btn btn-success">b7 호출</a>
  </p>
</div>  	
</body>
</html>
