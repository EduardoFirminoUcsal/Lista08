<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Aniversário</title>
</head>
<body>
<form action="CalculadoraIdadeServlet" method="get">
    <label for="anoNascimento">Ano de Nascimento:</label><br>
    <input type="number" id="anoNascimento" name="anoNascimento"><br>
    <label for="fezAniversario">Já fez aniversário este ano?</label><br>
    <select id="fezAniversario" name="fezAniversario">
        <option value="true">Sim</option>
        <option value="false">Não</option>
    </select><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
