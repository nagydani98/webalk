<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
		<title>Welcome!</title>
	</head>
	<body id="contentbody">
        <table class="defaulttable">
            <tr>
                <td>Bútor neve</td>
                <td>Bútor színe</td>
                <td></td>
            </tr>
        <c:forEach items = "${furniturelist}" var="furniture">
            <tr>
                <td>${furniture.name}</td>
                <td>${furniture.colour}</td>
                <form action="furniture/displaydetails" method="post">
                    <td>
                        <input type="submit" value="Részletek">
                        <input type="hidden" name="id" value="${furniture.id}">
                    </td>
                </form>
            </tr>
            </c:forEach>
        </table>
	</body>
</html>