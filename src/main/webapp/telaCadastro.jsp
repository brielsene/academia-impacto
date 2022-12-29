<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Impacto</title>
</head>
<body>

<form action="/academia-impacto/academiaServlet" method=post/>

Nome:<input type="text" name="nome"/>
</br></br>
CPF: <input type="text" name="cpf"/>
</br></br>
Idade: <input type="text" name="idade"/>
</br></br>
Altura: <input type="text" name="altura"/>
</br></br>
Peso: <input type="text" name="peso"/>
</br></br>
<input type="submit" value="Cadastrar"/>




</body>
</html>