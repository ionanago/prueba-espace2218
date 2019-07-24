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

@WebServlet("/BorrarProductoServlet")
public class BorrarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BorrarProductoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		Producto producto = new Producto(Long.valueOf((request.getParameter("id"))),request.getParameter("nombre"),request.getParameter("codigo"),BigDecimal.valueOf(Long.valueOf(request.getParameter("precio"))));
		ColeccionProductos productos = ColeccionProductos.getInstance();
		productos.eliminar(producto);
		}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
