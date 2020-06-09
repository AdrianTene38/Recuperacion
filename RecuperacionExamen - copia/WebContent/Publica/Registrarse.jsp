<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="/Practica02/Estilos/EstiloRegistro.css" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRARSE</title>

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
</head>

	<body>
		<h1>Registrate Ahora</h1>
		
			<form action="/Practica02/ControlaUsuario"
			method="post">
				<table border="1" align="center">
					<div align="center">
						<img src="/Practica_1/Imagenes/guia-telefonica.png" width="80"
							height="80" />
					</div>
					<tr>
						<td>Cédula:</a></td>
						<td><input type="text" name="cedula" value="${cedula}"
							minlength="10" class="login-field" " required /></td>
						<div style="color: red;">${requestScope.validacionesCedula}</div>
					</tr>
					<tr>
						<td>Nombre:</a></td>
						<td><input type="text" name="nombre" value="${nombre}"
							minlength="3" maxlength="48" class="login-field" /></td>
						<div style="color: red;">${requestScope.validacionesNombre}</div>

					</tr>
					<tr>
						<td>Apellido:</a></td>
						<td><input type="text" name="apellido" value="${apellido}"
							inlength="3" maxlength="48" class="login-field" required /></td>
						<div style="color: red;">${requestScope.validacionesApellido}</div>
					</tr>
					<tr>
						<td>Correo:</a></td>
						<td><input type="email" name="correo" maxlength="97" required
							value="${correo}" /></td>
						<div style="color: red;">${requestScope.validacionesCorreo}</div>

					</tr>
					<tr>
						<td>Contra:</a></td>
						<td><input type="password" name="contra" required
							value="${pass}" lass="login-field" /></td>
						<div style="color: red;">${requestScope.validacionesPassw}</div>
					</tr>

				</table>
				<br>
				<div class="center">
					<table border="0" align="center">
						<tr>
							<td>
								<button class="boton_personalizado" id="IngresoLog"
									type="submit">Registrarse</button>
							</td>
							<td><a href='/Practica02/Publica/Publica.html'>Volver al
									Inicio</a></td>
						</tr>
					</table>

				</div>
			</form>
	</body>
</form>
</html>