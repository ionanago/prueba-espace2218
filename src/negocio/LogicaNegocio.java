package negocio;

import java.math.*;
import java.util.*;

import modelos.Producto;
import modelos.Usuario;
import accessodatos.ColeccionUsuarios;

public class LogicaNegocio {
	public static boolean isAutenticado(Usuario usuario) {
		return ColeccionUsuarios.getInstance().comprobarU(usuario);
		}
	
	public static void deleteAttrs() {
		
	}
}
