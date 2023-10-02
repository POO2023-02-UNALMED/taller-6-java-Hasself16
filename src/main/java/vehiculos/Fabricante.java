package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Fabricante {
	private static List<Fabricante> listado = new ArrayList<>(); 
	private String nombre;
	private Pais pais;
	private List<Vehiculo> vehiculos = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		setPais(pais);
		Fabricante.listado.add(this);
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return (this.pais);
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
		pais.anadirFabrica(this);
	}
	
	public void anadirVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante x = null;
		int n=0;
		for (Fabricante fabricante: Fabricante.listado) {
			if (fabricante.vehiculos.size()>n) {
				x=fabricante;
				n=fabricante.vehiculos.size();
			}
		}
		return (x);
	}
	
	public int vehiculos() {
		return (this.vehiculos.size());
	}
}
