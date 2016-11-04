<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:url var="doAddNewEmployee"  value="/hr/doAddNewEmployee" />
	<form:form	commandName="employeesVO" 
				method="post" 
				action="${doAddNewEmployee}">
		<label for="lastName"> 이름 :  </label>
		<input type="text" id="lastName" name="lastName"><br/>
		<form:errors path="lastName"/><br/>
	
		<label for="salary"> 연봉 :  </label>
		<input type="text" id="salary" name="salary" value=0><br/>
		<form:errors path="salary"/><br/>
		
		<label for="jobId"> 직무 :  </label>
		<input type="text" id="jobId" name="jobId"><br/>
		<form:errors path="jobId"/><br/>
		<input type="submit" value="등록">
	</form:form>
</body>
</html>