package accessodatos;

import java.util.ArrayList;

import modelos.Usuario;

public class ColeccionUsuarios implements Crudable<Usuario> {
	
	public ColeccionUsuarios() {
		
	}
	private static ColeccionUsuarios instancia;
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public static ColeccionUsuarios getInstance() {
		if(instancia == null) {
			instancia = new ColeccionUsuarios();
			usuarios.add(new Usuario("admin","admin"));
			usuarios.add(new Usuario("usuario","usuario"));
		}
		
		return instancia;
	}
	
	@Override
	public Iterable<Usuario> getAll() {
		
		return usuarios;
	}

	@Override
	public Usuario getOne() {
		
		return null;
	}

	@Override
	public void insertar(Usuario usuario) {
		usuarios.add(usuario);
		
	}

	@Override
	public void eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	
	
}
