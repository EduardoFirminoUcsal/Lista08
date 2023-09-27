<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário</title>
</head>
<body>
<form action="FormularioServlet" method="post">
    <label for="nome">Nome:</label><br>
    <input type="text" id="nome" name="nome"><br>
    <label for="estadoCivil">Estado Civil:</label><br>
    <select id="estadoCivil" name="estadoCivil">
        <option value="Solteiro(a)">Solteiro(a)</option>
        <option value="Casado(a)">Casado(a)</option>
    </select><br>
    <label for="faixaEtaria">Faixa Etária:</label><br>
    <select id="faixaEtaria" name="faixaEtaria">
        <option value="3 a 10 anos">3 a 10 anos</option>
        <option value="11 a 25 anos">11 a 25 anos</option>
        <option value="36 a 55 anos">36 a 55 anos</option>
        <option value="56 a 100 anos">56 a 100 anos</option>
    </select><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
