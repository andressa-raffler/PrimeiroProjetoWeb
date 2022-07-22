<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 20/07/22
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Cliente</title>
</head>
<body>
    <h1>Cadastro de Cliente</h1>
<fieldset>
<form action = "cliente-servlet" method="post">
<div>
    <label for="idNome">Nome:</label>
    <input type="text" id="idNome" name="nome">
</div>

    <div>
        <label for="idCpf">CPF:</label>
        <input type="text" id="idCpf" name="cpf">
    </div>

<div>
    <label for="idEmail">Email:</label>
    <input type="text" id="idEmail" name="email">
</div>

<div>
    <label for="idIdade">Idade:</label>
    <input type="text" id="idIdade" name="idade">
</div>
    <input type="submit" value="Enviar"><br/>
</form>
</fieldset>
</body>
</html>
