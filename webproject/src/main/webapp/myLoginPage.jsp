<%-- 
    Document   : newjsf
    Created on : Oct 8, 2019, 10:42:16 AM
    Author     : murad_isgandar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head></head>
    <body>
        <h1>Login</h1>
        <form method="POST"
              action="/login">

            ${param.error?'Wrong credentials':''}
            <table>
                <tr>
                    <td><label>username</label></td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td><label>password</label></td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input name="submit" type="submit" value="submit" /></td>
                </tr>
            </table>
        </form>
</body>
</html>
