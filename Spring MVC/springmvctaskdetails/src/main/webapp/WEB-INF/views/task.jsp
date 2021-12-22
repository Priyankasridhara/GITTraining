<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter the details</title>
</head>
<body>
<form action="/task" method="get">
Task name:<br><input type="text" name="taskname"><br>
Task desc:<br><input type="text" name="taskdesc"><br>
Task status:<br><input type="text" name="taskstatus"><br>
Task priority:<br><input type="text" name="taskpriority"><br>
Task notes:<br><input type="text" name="tasknotes"><br>
Task bookmark:<br><input type="text" name="taskbookmark"><br>
ownerid:<br><input type="text" name="ownerid"><br>
created on:<br><input type="Date" name="createdon"><br>
Modified on:<br><input type="Date" name="Modifiedon"><br>

<center>
<br><input type="SUBMIT">
</center>
</form>
</body>
</html>