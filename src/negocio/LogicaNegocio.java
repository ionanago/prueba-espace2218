package negocio;

import java.math.*;
import java.util.*;

import modelos.Producto;
import modelos.Usuario;
import accessodatos.ColeccionUsuarios;

public class LogicaNegocio {
	public static boolean isAutenticado(Usuario usuario) {
		return "admin".equals(usuario.getUsuario()) && "admin".equals(usuario.getPassword());
	}
	
	public static void deleteAttrs() {
		
	}
}
