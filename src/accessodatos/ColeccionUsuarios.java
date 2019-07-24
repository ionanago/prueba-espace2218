package accessodatos;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

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
			usuarios.add(new Usuario("usuario2","2usuario"));
		}
		
		return instancia;
	}
	
	@Override
	public Iterable<Usuario> getAll() {
		
		return usuarios;
	}
	
	public boolean comprobarU(Usuario usuario) {
		if(usuarios.contains(usuario)) {
			usuario.setValido(true);
		return true;}
		return false;
		
		
	}

	

	@Override
	public void insertar(Usuario usuario) {
		usuarios.add(usuario);
		
	}
	public static void insertar( String usuario , String password) {
		usuarios.add(new Usuario(usuario,password));
	}

	
	public  void eliminar(Usuario usuario) {
		
		if(getOne(usuario)){usuarios.remove(usuario);}
		
		
	}
	
	@Override
	public void modificar(Usuario usuario ,Usuario usuarionuevo) {
		int indice = 0;
		if(getOne(usuario)) {
			
			indice = usuarios.lastIndexOf(usuario);
			usuarios.set(indice,usuarionuevo);
			
		}
		
	}

	@Override
	public void modificar(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario getOne() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean getOne(Usuario usuario) {
		return usuarios.contains(usuario);
		
	 	
		
	}

	
	
}
