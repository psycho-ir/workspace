<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<%!
    String name = "hello";

%>
Hello man
<h1>che pesari</h1>

<div>
    Ta inja ham residi? jdoijdi
    <br/>
    <%= name %>
    <%= request %>
    <%= exception %>
    <c:redirect url="/wow.jsp"></c:redirect>
</div>
</body>
</html>
