<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Pedidos</title>

<link rel="stylesheet" href="/RecuperacionExamen/Estilos/EstiloTabla.css" />
</head>
<body>
	<h1>Lista Telefonos</h1>
	<form action="/RecuperacionExamen/BuscaFecha" method="post">
		<table>
			<tr>
				<td>Ingrese Tarjeta:</a></td>
				<td><input type="text" name="codiguito" required /></td>
			</tr>


		</table>

		<table border="1" width="100%">
			<tr>
				<td>FECHA</td>
				<td>CLIENTE</td>
				<td>TOTAL</td>
				<td>OBSERVACIONES</td>
			     <td>PLATOS</td>
			</tr>
			<c:forEach var="pedido" items="${lista}">
				<tr>
					<td><c:out value="${pedido.fecha}" /></td>
					<td><c:out value="${pedido.cliente}" /></td>
					<td><c:out value="${pedido.total}" /></td>
					<td><c:out value="${pedido.observaciones}" /></td>
					<td><c:out value="${pedido.platos}" /></td>				

				</tr>
			</c:forEach>
			
		</table>
		<br>'

	</form>
</body>
</html>