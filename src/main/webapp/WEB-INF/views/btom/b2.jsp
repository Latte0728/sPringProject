<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>b2.jsp</title>
</head>
<body>
<p><br/></p>
<div class="container">
		<h2>이곳은 btom폴더의 b2.jsp입니다.</h2>
		<%-- <div><a href="${ctp}/btom/b2" class="btn btn-info">b2 호출</a></div> --%>
		<div><a href="b2?name=btom" class="btn btn-info">b2 호출</a></div>
		<!-- ?name=btom가 QueryString방식 -->
		<hr/>
		<div>
			<c:if test="${!empty name && !empty age}">넘어온 이름 : 
				${name} / ${age}
			</c:if>
				<!-- BtomController에서 넘어온 name과 age 값을 받음 -->
				<!-- @RequestMapping(value="b2Ok", method = RequestMethod.POST)
							public String  b2OkGet(String name, int age, Model model) {
							model.addAttribute("name", name);
							model.addAttribute("age", age);
							return "btom/b2"; 에서 BtomController에서 값이 생성되었음 -->
		</div>
		<hr/>
		<div>
			
			<form  method="post" >
				<div>성명 : <input type="text" name="name" value="${ctp}/" class="form-control" /></div>
				<div>나이 : <input type="number" name="age"  value="20" min="0" max="99"  class="form-control mb-2" /></div>
				<div>나이 : <input type="submit" value="전송"  class="btn btn-info" /></div>
			</form>
		</div>
		<p>
			<a href="${ctp}/" class="btn btn-warning">Home으로</a>
		</p>
</div>
<p><br/></p>
</body>
</html>