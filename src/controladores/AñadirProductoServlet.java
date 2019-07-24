package controladores;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.*;
import negocio.*;
import accessodatos.*;


@WebServlet("/AñadirProductoServlet")
public class AñadirProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VISTAS_PRINCIPAL_JSP = "/WEB-INF/vistas/inicio.jsp";   
    
    public AñadirProductoServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final RequestDispatcher requestDispatcherPrincipal = request.getRequestDispatcher(VISTAS_PRINCIPAL_JSP);
		long id = Long.valueOf(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String codigo = request.getParameter("codigo");
		BigDecimal precio = BigDecimal.valueOf(Long.valueOf(request.getParameter("precio")));
		ColeccionProductos.insertar(id, nombre, codigo, precio);
		
		
		requestDispatcherPrincipal.forward(request, response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
