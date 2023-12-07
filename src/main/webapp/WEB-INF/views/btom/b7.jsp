<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b7.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
  <h2>이곳은 btom폴더의 b7.jsp 입니다.</h2>
  <div><a href="b3?name=btom" class="btn btn-info">b7호출</a></div>
	<hr/>
	<div>
	  <form method="post">
	  	<div>성명 : <input type="text" name="name" id="name" value="홍길동" class="form-control"/></div>
	  	<div>나이 : <input type="number" name="age" id="age" value="20" min="0" max="99" class="form-control mb-2"/></div>
	  	<div>아이디 : <input type="text" name="mid" value="hkd1234" class="form-control"/></div>
	  	<div>비밀번호 : <input type="password" name="pwd" value="1234" class="form-control"/></div>
	  	<div>성별 : 
	  		<input type="radio" name="gender" value="남자" />남자 &nbsp;
	  		<input type="radio" name="gender" value="여자" checked/>여자
	  		</div>
	  	<div>주소 : <input type="text" name="address" value="청주" class="form-control mb-2"/></div>
	  	<div><input type="submit" value="전송" class="btn btn-secondary"/></div>
	  	<input type="hidden" name="job" value="학생" />
	  	<input type="hidden" name="wDate" value="<%= new java.util.Date() %>" />
	  </form>
	</div>
	<hr/>
	<div>
	  <%-- <c:if test="${!empty name && !empty age}">넘어온 값 :  --%>
	    ${vo.name} / ${vo.age} / ${vo.mid} /${vo.pwd} /${vo.gender} /${vo.address} /${vo.job} /${vo.WDate}
	    <!-- lombok의 특성상 2번째 글자가 대문자면 1번째 글자도 대문자로 작성 -->
	  <%-- </c:if> --%>
	  <!-- @RequestMapping(value = "/b5", method = RequestMethod.POST)
	public String b5Post(Model model,
		@RequestParam(name="name") String name,
		@RequestParam(name="age") int age,
		@RequestParam(name="mid") String mid,
		@RequestParam(name="pwd") String pwd,
		@RequestParam(name="gender") String gender,
		@RequestParam(name="address") String address
			) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		model.addAttribute("gender", gender);
		model.addAttribute("address", address);
		return "btom/b5";
	} 에서 넘어옴 -->
	</div>
	<p>
	  <a href="${ctp}/" class="btn btn-warning">Home으로</a>
	</p>
</div>
	<hr/>
<p><br/></p>
</body>
</html>