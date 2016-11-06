<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url var="doAddNewDepartment" value="/hr/doAddNewDepartment" />
	<form:form	commandName="departmentsVO" 
				method="post" 
				action="${doAddNewDepartment}">
		<label for="departmentName"> 부서명 :</label>
		<input type="text" id="departmentName" name="departmentName" />
		<form:errors path="departmentName" />
		<input type="submit" value="등록">
	</form:form>
</body>
</html>