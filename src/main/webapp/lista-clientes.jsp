<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 22/07/22
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Clientes</title>
</head>
<body>

    <h1> Lista de Clientes Cadastrados </h1>
    <h3>Cliente de id: ${idClienteSalvo} , cadastrado com sucesso!</h3><br/>
    <table border="solid">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>CPF</th>
            <th>E-mail</th>
            <th>Idade</th>
            <th>Maior de Idade</th>
        </tr>
        <c:forEach var="cliente" items="${clientes}" begin="<int>">
        <tr>
            <td>${id.count}</td>
            <td>${cliente.nome}</td>
            <td>${cliente.cpf}</td>
            <td>${cliente.email}</td>
            <td>${cliente.idade}</td>
            <td>
                <c:choose>
                    <c:when test="${cliente.idade >= 18}">
                        Sim
                    </c:when>
                    <c:when test="${cliente.idade < 18}">
                        Sim
                    </c:when>
                    <c:otherwise>
                        Nao foi registrado
                    </c:otherwise>

                </c:choose>
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
