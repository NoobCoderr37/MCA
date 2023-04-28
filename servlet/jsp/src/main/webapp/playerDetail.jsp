<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player Details</title>
</head>
<body>
    <h1>Player Details</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Game</th>
            <th>No. of Matches Played</th>
            <th>Email ID</th>
        </tr>
        <%
    // Define an array of players
    String[][] players = {
        {"John Doe", "Tennis", "10", "johndoe@example.com"},
        {"Jane Smith", "Basketball", "15", "janesmith@example.com"},
        {"Bob Johnson", "Football", "20", "bobjohnson@example.com"}
    };

    // Loop through the array and display each player's details in a row
    for (int i = 0; i < players.length; i++) {
        out.println("<tr>");
        for (int j = 0; j < players[i].length; j++) {
            out.println("<td>" + players[i][j] + "</td>");
        }
        out.println("</tr>");
    }
%>
    </table>
</body>
</html>