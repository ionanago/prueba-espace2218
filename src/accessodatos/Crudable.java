package accessodatos;

public interface Crudable<T> {
	
	public Iterable<T> getAll();
	public T getOne();
	public void insertar(T objeto);
	public void eliminar(T objeto);
	public void modificar(T objeto);
}
