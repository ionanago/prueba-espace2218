<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="contenedor">
	<c:if test="${opcion != null}">
		<h3>
			<a href="#" data-toggle="modal" data-target="#añadir" id="sfa"><i
				class="fas fa-plus fa-2x"></i></a>
		</h3>
	</c:if>
	<c:choose>
		<c:when test="${opcion == 'usuarios'}">
			<style>
.Mopcion {
	visibility: visible;
}
</style>
			<table class="usuarios-table">
				<thead>
					<tr>
						<th>Usuario</th>
						<th>Password</th>
						<th>Opciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${usuarios}" var="item">
						<tr>
							<td>${item.usuario}</td>
							<td>${item.password}</td>
							<td><a href="#" onclick="editar(this,event)"
								data-toggle="modal" data-target="#modificar"><i
									class="fas fa-edit"></i></a> <a href="BorrarUsuarioServlet"
								class="BorrarUsuarioServlet"> <i class="fas fa-trash"></i></a></td>
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
							<form id="formMod" action="ModificarUsuarioServlet" method="post"
								class="form-signin">
								<h1 class="h3 mb-3 font-weight-normal">Modifique los datos</h1>
								<div>
									 <input
										type="text" id="usuarioM" name="usuario" class="form-control"
										placeholder="" autofocus>
								</div>

								<div>
									 <input
										type="text" id="passwordM" name="password"
										class="form-control" placeholder="" autofocus>
								</div>


								<button class="btn btn-lg btn-primary btn-block" type="submit">Modificar
									Usuario</button>

							</form>
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
							<form action="AñadirUsuarioServlet" method="post"
								class="form-signin">
								<h1 class="h3 mb-3 font-weight-normal">Introduce los datos</h1>
								<label for="usuario" class="sr-only">Usuario</label> <input
									type="text" id="usuario" name="usuario" class="form-control"
									placeholder="usuario" required autofocus> <label
									for="password" class="sr-only">contraseña</label> <input
									type="password" id="password" name="password"
									class="form-control" placeholder="contraseña" required
									autofocus>

								<button class="btn btn-lg btn-primary btn-block" type="submit">Añadir
									Usuario</button>

							</form>
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
			<style>
.Mopcion {
	visibility: visible;
}
</style>
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
					<c:forEach items="${productos}" var="item">
						<tr>
							<td>${item.id}</td>
							<td>${item.nombre}</td>
							<td>${item.codigo}</td>
							<td>${item.precio}</td>
							<td><a href="#" data-toggle="modal" data-target="#modificar"><i
									class="fas fa-edit"></i></a> <a href="BorrarProductoServlet" class="BorrarProductoServlet"> <i
									class="fas fa-trash"></i></a></td>
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
						<div class="modal-body">le formulario mod pro</div>

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
						<form action="AñadirProductoServlet" method="post"
								class="form-signin">
								<h1 class="h3 mb-3 font-weight-normal">Introduce los datos</h1>
								<label for="nombre" class="sr-only">nombre</label> 
								<input
									type="text" id="nombre" name="nombre" class="form-control"
									placeholder="nombre" required autofocus> 
									
									<label for="codigo" class="sr-only">codigo</label> 
								<input
									type="text" id="codigo" name="codigo" class="form-control"
									placeholder="codigo" required autofocus> 
									
									<label for="precio" class="sr-only">precio</label> 
								<input
									type="number" id="precio" name="precio" class="form-control"
									placeholder="precio" required autofocus> 
									

								<button class="btn btn-lg btn-primary btn-block" type="submit">Añadir
									Producto</button>

							</form></div>

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
					<li class="opcion"><a href="inicio?opcion=usuarios">Usuarios</a>

					</li>
					<li class="opcion"><a href="inicio?opcion=productos">Productos</a></li>

				</ul>
			</div>
		</c:otherwise>
	</c:choose>
</div>


</body>
</html>