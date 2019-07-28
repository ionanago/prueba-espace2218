/**
 * 
 */
$(function() {
	$("#sfa").click(function(e) {
		e.preventDefault();

	});
	$(".BorrarProductoServlet").click(function(e) {
		e.preventDefault();
		var padre = $(this).parent().parent();
		var id = padre.find("td:first-child").text();
		var nombre = padre.find("td:nth-child(2)").text();
		var codigo  = padre.find("td:nth-child(3)").text();
		var precio = padre.find("td:nth-child(4)").text();
			$.post("BorrarProductoServlet", {
			id:id,nombre:nombre,codigo:codigo,precio:precio
		}).done(function(e) {
			padre.remove();
		}).fail(function(e) {
		});
	});
	
	
	
	$(".BorrarUsuarioServlet").click(function(e) {
		e.preventDefault();
		var padre = $(this).parent().parent();
		var usuario = padre.find("td:first-child").text();
		var password = padre.find("td:nth-child(2)").text();
		if(usuario != "admin"){
			$.post("BorrarUsuarioServlet", {
			usuario : usuario,
			password : password
		}).done(function(e) {
			padre.remove();
		}).fail(function(e) {
		});}
		else alert("No se puede borrar un admin!!")
		
		// alert(usuario + password);
		
	});
	$(".ModificarUsuarioServlet").click(function(e) {
		e.preventDefault();
		var padre = $(this).parent().parent();
		var usuario = padre.find("td:first-child").text();
		var password = padre.find("td:nth-child(2)").text();
		if(usuario != "admin"){
			$.post("ModificarUsuarioServlet", {
			usuarionuevo : usuario,
			passwordnuevo : password
		}).done(function(e) {
			
		}).fail(function(e) {
		});}
		else alert("No se puede modificar un admin!!")
		
		// alert(usuario + password);
	});
	
	$(".ModificarProductoServlet").click(function(e) {
		e.preventDefault();
		var padre = $(this).parent().parent();
		var id = padre.find("td:first-child").text();
		var nombre = padre.find("td:nth-child(2)").text();
		var codigo  = padre.find("td:nth-child(3)").text();
		var precio = padre.find("td:nth-child(4)").text();
		$.post("ModificarProductoServlet", {
			id:id,
			nombre:nombre,
			codigo:codigo,
			precio:precio
		}).done(function(e) {
			padre.remove();
		}).fail(function(e) {
		});
  });
})

function editar(t,e) {
	e.preventDefault();
	var padre = $(t).parent().parent(), i = 2;
	padre.find("td:not(:last-child)").each(function(){
		
		$("#formMod:nth-child(" + i + ") input").val($(this).html());
		console.log($("#formMod div:nth-child(" + i + ") input").val($(this).html()));
		
		i++;
	});
};