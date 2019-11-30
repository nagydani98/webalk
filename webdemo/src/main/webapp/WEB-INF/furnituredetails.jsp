<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
		<title>Részletek</title>
	</head>
	<body id="contentbody">
        <table class="defaulttable">
                <tr>
                        <td>Id</td>
                        <td>Név</td>
                        <td>Szín</td>
                        <td>Magasság</td>
                        <td>Szélesség</td>
                </tr>
                <tr>
                        <td>${chosenf.id}</td>
                        <td>${chosenf.name}</td>
                        <td>${chosenf.colour}</td>
                        <td>${chosenf.height}</td>
                        <td>${chosenf.width}</td>
                </tr>
        </table>
	</body>
</html>