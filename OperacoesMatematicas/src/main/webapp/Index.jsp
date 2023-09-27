<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Números</title>
</head>
<body>
<form action="CalculadoraServlet" method="post">
    <label for="numero1">Número 1:</label><br>
    <input type="number" id="numero1" name="numero1"><br>
    <label for="numero2">Número 2:</label><br>
    <input type="number" id="numero2" name="numero2"><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
