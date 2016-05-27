<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	新增：
	<form:form action="addUser.do" id="userForm" method="post" commandName="user" modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="account">账号：</form:label></td>
				<td>
					<form:input  path="account" />
					<font color="red"><form:errors path="account" /></font>
				</td>
			</tr>
			<tr>
				<td><form:label path="password">密码：</form:label></td>
				<td>
					<form:password path="password" />  
       	 			<font color="red"><form:errors path="password" /></font>
				</td>
			</tr>
			<tr>
				<td><form:label path="phone">手机：</form:label></td>
				<td>
					<form:input path="phone" />  
       	 			<font color="red"><form:errors path="phone" /></font>
				</td>
			</tr>
			<tr>
				<td><button type="submit">新增</button></td>
				<td><button type="reset">重置</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>