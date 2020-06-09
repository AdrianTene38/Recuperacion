<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Telefonos</title>
<link rel="stylesheet"
	href="/RecuperacionExamen/Estilos/EstiloTabla.css" />
</head>
<body>
	<form action="/RecuperacionExamen/ControlaTarjeta" method="post">


			<h1>Lista Comida</h1>
			<table border="1" width="100%">
				<tr>
					<td>Nombre</td>
					<td>Precio</td>
					<td>Selecciona</td>
				</tr>
				<c:forEach var="comida" items="${lista}">
					<tr>
						<td><c:out value="${comida.nombre}" /></td>
						<td><c:out value="${comida.precio}" /></td>
						<td><input type="checkbox" name="porfa"
							value="${comida.nombre}">selecciona</td>
					</tr>
				</c:forEach>
			</table>
			<br>'
			<div class="center">
				<table border="0" align="center">
					<tr>
						<td>
							<button class="boton_personalizado" id="IngresoLog" type="submit">Registrarse</button>
						</td>

					</tr>

				</table>
			</div>
		</form>
</body>
</html>