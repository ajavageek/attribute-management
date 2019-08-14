<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Attribute Management</title>
</head>
<body>
<h1>Attribute Management</h1>
<form action="${pageContext.request.contextPath}/">
    <input type="submit" value="Refresh"/>
</form>
<table>
    <tbody>
    <tr>
        <th>Explicitly set</th>
        <td>${requestScope.old.uid}</td>
    </tr>
    <tr>
        <th>Implicit bean</th>
        <td>${newThing.uid}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
