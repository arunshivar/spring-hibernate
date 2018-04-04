<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<form:form action="saveClass" method="post" modelAttribute="class">
    <h1>Class Form</h1>
    <p>
        <label>Class Name</label>
        <form:input path="className"></form:input>
    </p>
    <p>
        <input type="submit" value="Submit"/>
    </p>
</form:form>