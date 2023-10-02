package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
	private static List<Pais> listado = new ArrayList<>();
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre=nombre;
		Pais.listado.add(this);
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
