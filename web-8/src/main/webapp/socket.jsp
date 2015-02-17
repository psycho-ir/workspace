<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: soroosh
  Date: 12/7/14
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title></title>
    <script type="text/javascript">
        var client = new WebSocket("<c:url value="/home.jsp"></c:url>", "p1");
        if (client.readyState == WebSocket.OPEN){
            alert("Connection opened!!!");
        }
    </script>
</head>
<body>

</body>
</html>
