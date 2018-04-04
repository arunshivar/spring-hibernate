<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form:form action="saveTeacher" method="post" modelAttribute="teacher">
    <form:input path="teacherID" cssStyle="visibility: hidden"/>
    <p>
        <label>Teacher Name:</label>
        <form:input path="teacherName"/>
    </p>

    <p>
    <label>Course Name:</label>
    <%--<form:input path="courses"/>--%>
    <c:forEach items="${courses}" var="course" varStatus="myIndex">
        <%--<form:hidden path="courses[${myIndex.index}].courseName" value="${course.courseName}" />--%>
        <p>Course Name: <form:input path="courses[${myIndex.index}].courseName" value="${course.courseName}"/>

            <%--<a href="#" class="delete">Delete</a></p>--%>
    </c:forEach>

    </p>
    <p>
        <input type="submit" value="Submit"/>
    </p>
</form:form>

