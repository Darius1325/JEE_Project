<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<link rel="stylesheet" type="text/css" href="table.css" />

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div id="boxdiv">
        <br><br><br>
        <h1 align="center">Player list</h1>
        <br>
        <div align="center">
            <table border="1px solid black">
                <tr border="1px solid black">
                    <th>Nickname</th>
                    <th>Registration date</th>
                    <th>Sessions played</th>
                </tr>
                $entries
            </table><br><br>
            <button id="ban">Ban</button>
        </div>
    </div>
</body>

</html>