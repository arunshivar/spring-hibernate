<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>

<table border="1">
     <th>Name</th>
     <th>Action</th>
     <c:forEach var="teacher" items="${teacherList}">
        <tr>
            <td>${teacher.teacherName}</td>
            <td><a href="editTeacher?id=${teacher.teacherID}">Add class</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>