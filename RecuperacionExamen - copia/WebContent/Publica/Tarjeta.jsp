<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRE SU TARJETA	</title>
<link rel="stylesheet" href="/RecuperacionExamen/Estilos/EstiloRegistro.css" />
</head>
<body>
	<h1>Registra tu telefono</h1>
	<form action="/RecuperacionExamen/RegistraTarjeta" method="post">
		<table border="1" align="center">
		<tr>
			<td>Número de Tarjeta:</a></td>		
			<td><input type="text" name="numerotarjeta"required /></td>	
			
		</tr>
		<tr>
			<td>Nombre:</a></td>		
			<td><input type="text" name="nombre"required/></td>	
		</tr>
		<tr>
			<td>Fecha de Caducidad:</a></td>		
			<td><input type="text" name="fechacaducidad"required/></td>	
		</tr>
		<tr>
			<td>CVV:</a></td>		
			<td><input type="text" name="cvv"required/></td>	
		</tr>
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregatelefono"></td>	
		
		</tr>
	
	</form>
</body>
</html>