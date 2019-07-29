package controladores;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.*;
import negocio.*;
import accessodatos.*;

@WebServlet("/ModificarProductoServlet")
public class ModificarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModificarProductoServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Producto producto = new Producto(Long.parseLong((request.getParameter("id"))),request.getParameter("nombre"),request.getParameter("codigo"),new BigDecimal( request.getParameter("precio")));
		Producto productonuevo = new Producto(Long.parseLong((request.getParameter("idm"))),request.getParameter("nombrem"),request.getParameter("codigom"),new BigDecimal( request.getParameter("preciom")));
		ColeccionProductos productos = ColeccionProductos.getInstance();
		productos.modificar(producto,productonuevo);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
