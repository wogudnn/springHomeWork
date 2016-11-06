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
	<c:if test="${not empty employees}">
		<input type="button" value="사원등록" onclick="location.href='/SpringHomeWork/hr/addNewEmployee'"><br>
		<input type="button" value="부서목록" onclick="location.href='/SpringHomeWork/hr/departments'"><br>
	<c:forEach items="${employees}" var="employee" >
		${employee.employeeId} / ${employee.positionVO.position}/ ${employee.lastName}/ ${employee.jobId}/ ${employee.salary}/${employee.departmentsVO.departmentName}
		<input type="button" value="상세기능" onclick="location.href='/SpringHomeWork/hr/employees/${employee.employeeId}'"> >
		<br/>
	</c:forEach>
	</c:if>
	<c:if test="${not empty employee}">
	${employee.employeeId} / ${employee.positionVO.position}/ ${employee.lastName}/ ${employee.jobId}/ ${employee.salary}/${employee.departmentsVO.departmentName}
	<input type="button" value="퇴사" onclick="location.href='/SpringHomeWork/hr/employees/doDeleteEmployee/${employee.employeeId}'"><br/>
		<c:url var="doModifyJobId" value="/hr/doModifyJobId" />
		<form:form commandName="employeesVO" method="post" action="${doModifyJobId}">
			<label for="jobId">직무 변경 : </label>
			<input type="text" id="jobId" name="jobId">
			<form:errors path="jobId"/>
			<input type="hidden" id="employeeId" name="employeeId" value="${employee.employeeId}">
			<input type="submit" value="등록">
		</form:form>
		<c:if test="${employee.positionId ne 9}">
			<input type="button" value="진급" onclick="location.href='/SpringHomeWork/hr/position/doLevelUpEmployeePosition/${employee.employeeId}'"><br/>
		</c:if>
		<c:forEach items="${departments}" var="department">
			${department.departmentName}<input type="button" value="부서선택" onclick="location.href='/SpringHomeWork/hr/departments/doSelectDepartment?departmentId=${department.departmentId}&&employeeId=${employee.employeeId}'"><br/>
		</c:forEach>
	</c:if>

</body>
</html>