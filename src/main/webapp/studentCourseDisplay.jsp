<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/23/2023
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.CourseDefinition" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Course" %>
<%@ page import="model.StudentRegistration" %>
<%@ page import="Service.*" %>
<%@ page import="model.StudentCourse" %>
<html>
<body>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>STD_REG</th>
        <th>COURSES</th>
        <th>CREDITS</th>
        <th>RESULTS</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<StudentCourse> courses = new ArrayList<StudentCourse>();
        StudentCourseService service = new StudentCourseServiceImpl();
        courses = service.studentCourseList();

        for(StudentCourse course : courses){
    %>
    <tr>
        <td><%=course.getId()%></td>
        <td><%=course.getStudentRegistration().getStudent().getRegNo()%></td>
        <td><%=course.getCourse().getCourseDefinition().getName() %></td>
        <td><%=course.getCredits()%></td>
        <td><%=course.getResults()%></td>

        <td>
            <div class="tdAction">
                <button class="updateBtn">?</button>
                <button class="deleteBtn">x</button>
            </div>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
