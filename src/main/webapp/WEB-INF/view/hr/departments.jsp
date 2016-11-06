<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="부서등록" onclick="location.href='/SpringHomeWork/hr/addNewDepartment'">
	<input type="button" value="사원목록" onclick="location.href='/SpringHomeWork/hr/employees'"><br/>
	<c:forEach items="${departments}" var="department">
		${department.departmentName}<input type="button" value="삭제" onclick="location.href='/SpringHomeWork/hr/departments/delete/${department.departmentId}'" ><br/>
	</c:forEach>

</body>
</html>