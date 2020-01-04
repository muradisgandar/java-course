<%-- 
    Document   : students
    Created on : Sep 21, 2019, 6:36:14 PM
    Author     : murad_isgandar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            Users:
            <c:forEach items="${studentList}" var="item">
                ${item.name}-${item.surname}-${item.age}<br>
            </c:forEach>

                <form:form method="POST"
                       action="/students"
                       modelAttribute="student">
                       
                <table>
                    <tr>
                        <td><form:label path="name">Name</form:label></td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="surname">surname</form:label></td>
                        <td><form:input path="surname"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"/></td>
                    </tr>
                </table>
            </form:form>

            SEARCH  

            <form:form method="GET"
                       action="/students/search">
                <table>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="nm"/></td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td><input type="text" name="surname"/></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="age"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Search"/></td>
                    </tr>
                </table>
            </form:form>
        </body>
    </html>
</f:view>
