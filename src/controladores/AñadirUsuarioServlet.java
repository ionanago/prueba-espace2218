package controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import accessodatos.*;


@WebServlet("/AñadirUsuarioServlet")
public class AñadirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VISTAS_PRINCIPAL_JSP = "/WEB-INF/vistas/inicio.jsp";   
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final RequestDispatcher requestDispatcherPrincipal = request.getRequestDispatcher(VISTAS_PRINCIPAL_JSP);

		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		ColeccionUsuarios.insertar(usuario,password);
		
		
		requestDispatcherPrincipal.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
