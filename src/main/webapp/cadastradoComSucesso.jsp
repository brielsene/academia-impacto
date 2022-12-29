<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrado com sucesso</title>
</head>
<body>

Seus dados:

</br></br>
Nome: ${nome}
</br></br>
Cpf: ${cpf}
</br></br>
Idade: ${idade}
</br></br>
Altura: ${altura}
</br></br>
Peso: ${peso}
</br></br>
IMC: ${imc }    -> Consultar tabela de IMC: <a href="https://www.calculoimc.com.br/tabela-de-imc">Clique aqui</a> 



</body>
</html>