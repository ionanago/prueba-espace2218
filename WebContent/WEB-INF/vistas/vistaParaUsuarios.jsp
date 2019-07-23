<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="contenedor">	
		 <table class="usuarios-table">
		 	<thead>
		 	<tr>
		 		<th>ID</th>
		 		<th>Nombre</th>
		 		<th>Codigo</th>
		 		<th>Precio</th>
		 		
		 	</tr>
		 	</thead>
		 	<tbody>
		 		<c:forEach items="${productos}" var="item" >
		 			<tr>
			 			<td>${item.id}</td>
			 			<td>${item.nombre}</td>
			 			<td>${item.codigo}</td>
			 			<td>${item.precio}</td>
		 			</tr>
	    		</c:forEach>
		 	</tbody>
		 </table>

</div>
<!-- The Modal -->

</body>
</html>