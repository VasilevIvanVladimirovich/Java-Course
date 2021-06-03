<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Добавление пользователя</title>
</head>
<body>

<div class="header">
    <div class="header-text">
        <a href="./"><h1>Главная страница</h1></a>
    </div>
</div>


<div class="content">
    <form action="./add" class="form-add" method="Post">
        <h2>Добавить пользователя</h2>
        <div class="form-row">
            <label for="email">Имя пользователя: </label></br>
            <input type="text" id="email" required autocomplete="off" name="login">
        </div>
        <div class="form-row">
            <label for="password">Пароль: </label> </br>
            <input type="password" id="password" required autocomplete="off" name="password">
        </div>

        <div class="but">
            <input class="input-button" type="submit" value="Отправить">
        </div>
    </form>
</div>

<div class="footer"></div>
</body>
</html>
