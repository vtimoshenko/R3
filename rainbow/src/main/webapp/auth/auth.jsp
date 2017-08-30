<%-- 
    Document   : auth
    Created on : 30.08.2017, 14:24:04
    Author     : vtimoshenko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход в систему</title>
    </head>
    <body>
        <form action="/Authorization" method="post">
            Login: <input type="text" name="j_username"><br>
            Password: <input type="password" name="j_password"><br>
            <input type="submit" value="Вход">
        </form>
    </body>
</html>
