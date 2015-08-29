<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Student list</title>
</head>
<body>
students:
<table>
  <tr>
    <th>
      Last name
    </th>
    <th>
      First name
    </th>
    <th>
      Birthday
    </th>
  </tr>
  <c:forEach items="${studentList}" var="student">
    <tr>
      <td>${student.lastName}</td>
      <td>${student.firstName}</td>
      <td>
        <fmt:formatDate value="${student.birthday}" pattern="yyyy.MM.dd" type="date"/>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
