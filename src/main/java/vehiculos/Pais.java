package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
	private static List<Pais> listado = new ArrayList<>();
	private String nombre;
	private List<Fabricante> fabricas= new ArrayList<>();
	
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
	
	public void anadirFabrica(Fabricante fabrica) {
		this.fabricas.add(fabrica);
	}
	
	public static Pais paisMasVendedor() {
		Pais x =null;
		int n = 0;
		for (Pais pais : Pais.listado) {
			int y=0;
			for (Fabricante fabrica : pais.fabricas) {
				y = y + fabrica.vehiculos();
			}
			if (y>n) {
				x= pais;
				n=y;
			}
		}
		return (x);
	}
}
