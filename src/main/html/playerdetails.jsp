<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<link rel="stylesheet" type="text/css" href="form.css" />
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details</title>
</head>
<body>
    <div id="boxdiv" style="width:40%">
    <h1 align="center">
        Nom du jeu
    </h1><br>
    <div align="center">
        <form>
            <table>
                <tr>
                    <td align="right"><label>Nickname :</label></td>
                    <td><input type="text" placeholder="nickname" id="nickname"></td>
                </tr>
                <tr></tr><tr></tr><tr></tr>
                <tr>
                    <td align="right"><label>Password :</label></td>
                    <td><input type="password" placeholder="password" id="password"></td>
                </tr>
                <tr></tr><tr></tr><tr></tr>
                <tr>
                    <td align="right"><label>Confirm password :</label></td>
                    <td><input type="password" placeholder="password" id="confirm"></td>
                </tr>
                <tr></tr><tr></tr><tr></tr>
                <tr>
                    <td align="right"><label>E-mail :</label></td>
                    <td><input type="text" placeholder="email" id="email"></td>
                </tr><tr></tr><tr></tr><tr></tr>
                <tr>
                    <td align="right"><label>Birthday :</label></td>
                    <td><input type="date" placeholder="mm/dd/yyyy" id="birthday"></td>
                </tr><tr></tr><tr></tr><tr></tr>
                <tr>
                    <td align="right"><label>Favorite games :</label></td>
                    <td><input type="text" placeholder="games" id="favorite"></td>
                </tr>
            </table><br>
            <input type="submit" id="submit" value="Submit">
        </form>
    </div></div>
</body>
</html>