<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" uri="http://soroosh.com/jsp/test" %>

<html>
<head>
    <title></title>
</head>
<body>
${((a)->a+3)(4)}
${fn:toUpperCase("soroosh")}
<c:out value="<h1>Hi</h1>" escapeXml="false"></c:out>
<c:url value="http://google.com">
    <c:param name="a" value="b"></c:param>
</c:url>
<c:forEach begin="0" end="100" var="i" varStatus="status">
    <div><b>${status.first}</b>${i}</div>
</c:forEach>
<t:catch var="AAA">
    <h1>OOOPs</h1>
</t:catch>
</body>
</html>
