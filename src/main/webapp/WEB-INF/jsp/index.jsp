<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Hello page</title>
</head>
<body>
<h1>Welcome to our school "${schoolName}"</h1>
<b>We have ${studentsCount} student already studying at ours.</b>
<a href="/students">View student list</a>
</body>
</html>
