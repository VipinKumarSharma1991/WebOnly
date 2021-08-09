<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
color: red;
position: fixed;
}
</style>
</head>
<body>
<form:form  action="getFormData" modelAttribute="data">
<h2>Welcome to first program</h2>
<label>Name : </lable><form:input  path="webSiteName"/>
<form:errors cssClass="error" path="webSiteName"></form:errors>
<label>Address : </label><form:input  path="webSiteCategory"/></p>
<form:errors cssClass="error" path="webSiteCategory"></form:errors>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>