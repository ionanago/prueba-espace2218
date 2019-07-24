/**
 * 
 */
$(function() {
	$("#sfa").click(function(e) {
		e.preventDefault();

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
	
	
	
	function editar(t,e) {
		e.preventDefault();
		var padre = $(t).parent().parent(), i = 1;
		padre.find("td:not(:last-child)").each(function(){
			$("#formMod:nth ").val($(this).html());
			i++;
		});
	}
});