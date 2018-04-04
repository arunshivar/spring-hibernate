<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<form:form action="saveStudent" method="post" modelAttribute="student">
    <h1> Student Form </h1>
    <p>
        <label>Name:</label>
        <form:input path="studentName"/>
    </p>
    <p>
        <label><b>Address</b></label>
    <p><label>Street</label>
        <form:input path="studentAddress.street" /></p>
    <p><label>City</label>
        <form:input path="studentAddress.city" /><br></p>
    <p><label>State</label>
        <form:input path="studentAddress.state"/></p>
    </p>
    <p>
        <input type="submit" value="Submit"/>
    </p>
</form:form>