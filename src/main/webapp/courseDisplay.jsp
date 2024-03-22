<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.CourseDefinition" %>
<%@ page import="Service.CourseDefService" %>
<%@ page import="Service.CourseDefServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Course" %>
<%@ page import="Service.CourseService" %>
<%@ page import="Service.CourseServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="../page/style.css" rel="stylesheet" type="text/css"/>

<html>
<body>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Course Name</th>
        <th>Semester</th>
        <th>Teacher</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Course> courses = new ArrayList<>();
        CourseService service = new CourseServiceImpl();
        courses = service.getCourse();

        for(Course course : courses){
    %>
    <tr>
        <td><%=course.getId()%></td>
        <td>
            <% if (course.getCourseDefinition() != null) { %>
            <%=course.getCourseDefinition().getName()%>
            <% } %>
        </td>
        <td><%=course.getSemester().getName()%></td>
        <td><%=course.getTeacher().getNames()%></td>
        <td>
            <div class="tdAction">
                <button class="updateBtn">?</button>
                <button class="deleteBtn">x</button>
            </div>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
