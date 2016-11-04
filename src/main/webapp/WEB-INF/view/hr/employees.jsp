<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty employees}">
	<c:forEach items="${employees}" var="employee" >
		${employee.employeeId} / ${employee.positionId}/ ${employee.lastName}/ ${employee.jobId}/ ${employee.salary}/${employee.departmentName}
		<input type="button" value="상세기능" onclick="location.href='/SpringHomeWork/hr/employees/${employee.employeeId}'"> >
		<br/>
	</c:forEach>
	</c:if>
	<c:if test="${not empty employee}">
	${employee.employeeId} / ${employee.positionId}/ ${employee.lastName}/ ${employee.jobId}/ ${employee.salary}/${employee.departmentName}
	<input type="button" value="퇴사" onclick="location.href='/SpringHomeWork/hr/employees/doDeleteEmployee/${employee.employeeId}'">
	<input type="button" value="진급" onclick="location.href='/SpringHomeWork/hr/employees/doLevelUpEmployeePosition/${employee.employeeId}'">
	</c:if>

</body>
</html>