package accessodatos;

import java.math.*;
import java.util.*;

import modelos.Producto;
import modelos.Usuario;

public class ColeccionProductos implements Crudable<Producto>{
	public ColeccionProductos() {}
	private static ColeccionProductos instancia;
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	public static ColeccionProductos getInstance() {
		if(instancia == null) {
			instancia = new ColeccionProductos();
			productos.add(new Producto(1L,"Squier Telecaster","xxx0",new BigDecimal("175.00")));
			productos.add(new Producto(2L,"Fender Jazzmaster","xxx1",new BigDecimal("900.00")));
			productos.add(new Producto(3L,"Ibanez 1306","xxx2",new BigDecimal("1333.00")));
			productos.add(new Producto(4L,"Ltd 155-dx","xxx3",new BigDecimal("420.50")));
			productos.add(new Producto(5L,"Danelectro Dano Pro","xxx4",new BigDecimal("395.00")));
			productos.add(new Producto(6L,"Rickenbacker 4003 MG","xxx5",new BigDecimal("2145.00"))); 
			productos.add(new Producto(7L,"Warwick AL Bootsy Collins Spacebass","xxx6",new BigDecimal("1199.00")));
		}
		
		return instancia;
	}
	@Override
	public Iterable<Producto> getAll() {
		return productos;
	}

	@Override
	public Producto getOne() {
		
		return null;
	}

	@Override
	public  void insertar(Producto objeto) {
		
		
	}
	public static void insertar(long id, String nombre, String codigo, BigDecimal precio) {
		productos.add(new Producto(id,nombre,codigo,precio));
	}

	
	@Override
	public void eliminar(Producto objeto) {
		if(getOne(objeto)){productos.remove(objeto);}
		
	}
	public boolean getOne(Producto objeto) {
		return productos.contains(objeto);}

	@Override
	public void modificar(Producto objeto) {
		
		
	}
	@Override
	public void modificar(Producto objeto, Producto objetonuevo) {
		// TODO Auto-generated method stub
		
	}
	
}
