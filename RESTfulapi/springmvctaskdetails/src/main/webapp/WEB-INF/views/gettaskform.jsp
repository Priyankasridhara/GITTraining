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


<h1>Retrieve data from database in jsp</h1>


<table border="1">
<tr>
<th>TaskId </th>
<th>OwnerId</th>
<th>Taskname</th>
<th>Description</th>
<th>Status</th>
<th>Priority</th>
<th>Notes</th>
<th>Bookmarked</th>
<th>CreatorId</th>
<th>CreatedOn</th>
<th>ModifiedOn</th>
</tr>
<c:forEach  var="task" items="${tasklist}">
<tr>
<td>${task.taskId}</td>
<td>${task.ownerId }</td>
<td>${task.taskname }</td>
<td>${task.description }</td>
<td>${task.status }</td>
<td>${task.priority }</td>
<td>${task.notes }</td>
<td>${task.isBookmarked }</td>
<td>${task.creatorId }</td>
<td>${task.createdOn}</td>
<td>${task.modifiedOn }</td>
</tr>
</c:forEach>


</body>
</html>


</body>
</html>