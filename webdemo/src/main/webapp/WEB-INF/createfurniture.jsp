<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <title>Felvétel</title>
</head>

<body id="contentbody">
    <form action="furniture" method="post">
        <table class="defaulttable">
            <tr>
                <td>
                    Bútor neve: <input type="text" name="name" />
                </td>
            </tr>
            <tr>
                <td>
                    Színe: <input type="text" name="colour" />
                </td>
            </tr>
            <tr>
                <td>
                    Magassága: <input type="text" name="height" />
                </td>
            </tr>
            <tr>
                <td>
                    Szélessége: <input type="text" name="width" />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="furniture" value="Felvétel" />
                </td>
            </tr>

        </table>
    </form>
</body>

</html>