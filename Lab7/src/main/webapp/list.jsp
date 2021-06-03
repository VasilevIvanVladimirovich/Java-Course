<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="Classes.*" %>

<%
    List<User> users = Base.getInstance().getUserList();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Список пользователей</title>
</head>
<body>

<div class="header">
    <div class="header-text">
        <a href="./"><h1>Главная страница</h1></a>
    </div>
</div>

<div class="content">
    <table>
        <tr>
            <th>
                Имя пользователя
            </th>
            <th>
                Пароль
            </th>
        </tr>
        <%
            for (User user : users) {
        %>
        <tr>
            <td>
                <%= user.getLogin()%>
            </td>
            <td>
                <%= user.getPassword()%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</div>
<div class="footer"></div>
</body>
</html>
