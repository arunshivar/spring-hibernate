<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script>
        $(document).ready(function() {
            var i = 0;
            var add_course = $(".add_new_course");
            var wrapper = $(".courses");
            $(add_course).click(function(e){
                e.preventDefault();
                $(wrapper).append('<p>Course Name: <input type="text" name="courses[' + i +'].courseName"/><a href="#" class="delete">Delete</a></p>'); //add input box
                i = i+1;
            });

            $(wrapper).on("click",".delete", function(e){
                e.preventDefault();
                $(this).parent('p').remove();
                i = i-1;
            })
        });
    </script>
</head>
<body>
<form:form action="saveTeacher" method="post" modelAttribute="teacher">
    <p>
        <label>Name: </label>
        <form:input path="teacherName"/>
    </p>

    <p>
    <span class="courses">
    </span>
        <label class="add_new_course">
            Add New Course
        </label>
    </p>
    <p>
        <input type="submit" value="Submit"/>
    </p>
</form:form>
</body>
</html>