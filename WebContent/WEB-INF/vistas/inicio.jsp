<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="contenedor">
<c:if test="${opcion != null}">
	<h3><a href="#" data-toggle="modal" data-target="#añadir" id="sfa"><i class="fas fa-plus fa-2x"></i></a></h3>
</c:if>
<c:choose>
	<c:when test="${opcion == 'usuarios'}">
	<style>.Mopcion{visibility:visible;}</style> 
	 <table class="usuarios-table">
	 	<thead>
	 	<tr>
	 		<th>Usuario</th>
	 		<th>Password</th>
	 		<th>Opciones</th>
	 	</tr>
	 	</thead>
	 	<tbody>
	 		<c:forEach items="${usuarios}" var="item" >
	 			<tr>
		 			<td>${item.usuario}</td>
		 			<td>${item.password}</td>
		 			<td><a href="#" data-toggle="modal" data-target="#modificar"><i class="fas fa-edit"></i></a> <a href="#"> <i class="fas fa-trash"></i></a></td>
	 			</tr>
    		</c:forEach>
	 	</tbody>
	 </table>
	 <!--  modificar usuario --> 
	  <div class="modal" id="modificar">
	  <div class="modal-dialog">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">Modificar Usuario</h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body">
	        le form mod user
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	      </div>
	
	    </div>
	  </div>
	</div>
	 
	 <!--  añadir usuario --> 
	 <div class="modal" id="añadir">
	  <div class="modal-dialog">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">Añadir Usuario</h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body">
	        le form aña user
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	      </div>
	
	    </div>
	  </div>
	</div>
	</c:when>
		<c:when test="${opcion == 'productos'}">
		<style>.Mopcion{visibility:visible;}</style> 
		 <table class="usuarios-table">
		 	<thead>
		 	<tr>
		 		<th>ID</th>
		 		<th>Nombre</th>
		 		<th>Codigo</th>
		 		<th>Precio</th>
		 		<th>Opciones</th>
		 	</tr>
		 	</thead>
		 	<tbody>
		 		<c:forEach items="${productos}" var="item" >
		 			<tr>
			 			<td>${item.id}</td>
			 			<td>${item.nombre}</td>
			 			<td>${item.codigo}</td>
			 			<td>${item.precio}</td>
			 			<td><a href="#" data-toggle="modal" data-target="#modificar"><i class="fas fa-edit"></i></a> <a href="#"> <i class="fas fa-trash"></i></a></td>
		 			</tr>
	    		</c:forEach>
		 	</tbody>
		 </table>
		<!--  modificar producto --> 
	  <div class="modal" id="modificar">
	  <div class="modal-dialog">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">Modificar Producto</h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body">
	        le formulario mod pro
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	      </div>
	
	    </div>
	  </div>
	</div>
	 
	 <!--  añadir producto --> 
	 <div class="modal" id="añadir">
	  <div class="modal-dialog">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">Añadir Producto</h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body">
	        le formulario aña pro
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	      </div>
	
	    </div>
	  </div>
	</div>
	
		</c:when>
	<c:otherwise>
	 <div class="opciones">
		<ul>
			<li class="opcion">
				
					<a href="inicio?opcion=usuarios">Usuarios</a>
				
			</li>
			<li class="opcion"><a href="inicio?opcion=productos">Productos</a></li>
			
		</ul>
	</div>
	</c:otherwise>
</c:choose>
</div>


</body>
</html>