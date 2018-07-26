<%--
  Created by IntelliJ IDEA.
  User: 1234567890
  Date: 7/26/2018
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<div class="content">
    <h1>Vietnamese Dictionary</h1>
    <form action="/translate" method="post">
        <input type="text" name="txtSearch"/>
        <input type="submit" value="Search">
    </form>
</div>
</body>
</html>
