<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>盗版之家</title>
</head>
<body>
  <c:if test="${!empty error}">
    <font color="red">
      <c:out value="${error}" />
    </font>
  </c:if>
  <form action="<c:url value="/loginCheck.html"/>" method="post">
    <label>用户名：</label>
    <input type="text" name="username">
    <br>
    <label>密码：</label>
    <input type="password" name="password">
    <br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
  </form>
</body>
</html>