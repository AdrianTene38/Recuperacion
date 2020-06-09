<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Telefono</title>

<style type="text/css">
.boton_personalizado {
	text-decoration: none;
	padding: 10px;
	font-weight: 600;
	font-size: 20px;
	color: #ffffff;
	background-color: #1883ba;
	border-radius: 6px;
	border: 2px solid #0016b0;
}
</style>
<link rel="stylesheet" href="/RecuperacionExamen/Estilos/EstiloRegistro.css" />
</head>
<body>
	<h1>Actualizar Telefono</h1>

	<form action="/RecuperacionExamen/ControlaPedido" method="post">
		<table border="0" align="center">

			<div align="center">
				<img src="/RecuperacionExamen/Imagenes/call-center.png" width="80"
					height="80" />
			<tr>
				<td><label>Numero Tarjeta</label></td>
				<td><input type="text" name="numerotarjeta" required
					value="<c:out value="${tarjeta.numerotarjeta}"></c:out>"></td>
			</tr>
			<tr>
				<td><label>Fecha</label></td>
				<td><input type="text" name="fechapedido" required /></td>
			</tr>
			<tr>
				<td><label>Cliente</label></td>
				<td><input type="text" name="cliente" required /></td>
			</tr>
			<tr>
			<tr>
				<td><label>Total</label></td>
				<td><input type="text" name="total" required
					value="<c:out value="${pedido.total}"></c:out>"></td>
			</tr>
			<tr>
				<td><label>Observaciones</label></td>
				<td><input type="text" name="observaciones" required /></td>
			</tr>
			
			<tr>
				<td><label>Platos Elegidos</label></td>
				<td><input type="text" name="comida" required
					value="<c:out value="${pedido.platos}"></c:out>"></td>
			</tr>
			</div>
			
		</table>
		<table border="0" align="center">
			<tr>
				<td>
					<button class="boton_personalizado" id="IngresoLog" type="submit">GuardarCambios</button>
				</td>
			</tr>
		</table>
		<table border="0" align="center">
			
		</table>
	</form>
</body>
</html>