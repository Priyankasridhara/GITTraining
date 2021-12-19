<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login confirmation</title>
</head>
<body>
The login is confirmed: ${param.name} 
<br/><br/>
The task assigned was:${param.task }
<br/><br/>
<!-- display multiple  taks which was assigned  -->
<ul>
<%
String[] tasks=request.getParameterValues("mtask");
for(String temptask: tasks){
	out.println("<li>"+temptask+"</li>");
	
}
%></ul>
The priority for ${param.task } is ${param.priority }
<br/><br/>
The task assigned for ${param.task } is  ${param.bm}

</body>
</html>