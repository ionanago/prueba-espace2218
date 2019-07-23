package controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import accessodatos.ColeccionProductos;
import modelos.Usuario;

/**
 * Servlet implementation class PrincipalUsuarioServlet
 */
@WebServlet("/PrincipalUsuarioServlet")
public class PrincipalUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VISTAS_LOGIN_JSP = "/WEB-INF/vistas/login.jsp";
	private static final String VISTAS_USUARIO_JSP = "/WEB-INF/vistas/vistaParaUsuarios.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrincipalUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final RequestDispatcher requestDispatcherLogin = request.getRequestDispatcher(VISTAS_LOGIN_JSP);
		final RequestDispatcher requestDispatcherPrincipalUsuario = request.getRequestDispatcher(VISTAS_USUARIO_JSP);
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		if(usuario==null) {
			requestDispatcherLogin.forward(request, response);
			return;
		}else {
			ColeccionProductos productos = ColeccionProductos.getInstance(); 
			request.setAttribute("productos", productos.getAll());
			requestDispatcherPrincipalUsuario.forward(request,response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
