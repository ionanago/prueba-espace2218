package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.*;
import negocio.*;
import accessodatos.*;

@WebServlet("/ModificarUsuarioServlet")
public class ModificarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ModificarUsuarioServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Usuario usuarionuevo = new Usuario(request.getParameter("usuarionuevo"),request.getParameter("passwordnuevo"));		
		Usuario usuario = new Usuario(request.getParameter("usuario"),request.getParameter("password"));
		ColeccionUsuarios usuarios = ColeccionUsuarios.getInstance();
		usuarios.modificar(usuario,usuarionuevo);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
