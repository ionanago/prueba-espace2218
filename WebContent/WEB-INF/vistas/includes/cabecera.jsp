
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo_JavaEE</title>
<base href="${pageContext.request.contextPath}/">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.all.min.css">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/js.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${usuario != null}">
	<h1><a href="inicio"><i class="fas fa-cogs"></i></a><a>listado de ${opcion}</a><a class="logout" href="logout">Logout</a></h1>
</c:if>