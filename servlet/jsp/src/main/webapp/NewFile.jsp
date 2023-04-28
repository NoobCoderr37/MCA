<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company Details</title>
</head>
<body>
    <h1>Company Details</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Location</th>
            <th>Address</th>
            <th>Email-id</th>
            <th>Phone_no</th>
        </tr>
        <tr>
            <td><%= request.getParameter("name") %></td>
            <td><%= request.getParameter("location") %></td>
            <td><%= request.getParameter("address") %></td>
            <td><%= request.getParameter("email") %></td>
            <td><%= request.getParameter("phone") %></td>
        </tr>
    </table>
</body>
</html>