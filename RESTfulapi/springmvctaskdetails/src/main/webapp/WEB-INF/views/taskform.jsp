<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter the task details</title>
</head>
<body>
<form:form modelAttribute="taskModel" method="POST" action="taskform" >
	<table>
				<tr>
					<td>Task name:</td>
					<td><form:input path="taskname" /></td>
					<td><form:errors path="taskname" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Task description:</td>
					<td><form:input path="description" /></td>
					<td><form:errors path="description" cssClass="error" /></td>
				</tr>
				<tr>
				
				<tr>
					<td>Task status:</td>
					<td><form:input path="status" /></td>
					<td><form:errors path="status" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Task priority:</td>
					<td><form:input path="priority" /></td>
					<td><form:errors path="priority" cssClass="error" /></td>
				</tr>
				<tr>
				<tr>
					<td>Task notes:</td>
					<td><form:input path="notes" /></td>
					<td><form:errors path="notes" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Task Bookmark:</td>
					<td><form:input path="isBookmarked" /></td>
					<td><form:errors path="isBookmarked" cssClass="error" /></td>
				</tr>
				<tr>
				<tr>
					<td>Owner Id:</td>
					<td><form:input path="ownerId" /></td>
					<td><form:errors path="ownerId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>created on:</td>
					<td><form:input type="date" path="createdOn" /></td>
					<td><form:errors path="createdOn" cssClass="error" /></td>
				</tr>
				<tr>
				<tr>
					<td>Modified on:</td>
					<td><form:input type="date" path="modifiedOn" /></td>
					<td><form:errors path="modifiedOn" cssClass="error" /></td>
				</tr>
				
				<tr>
				
				<tr>
					<td colspan="3"><input type="submit" value="Submit" /></td>
				</tr>
	</table>
</form:form>



</body>
</html>