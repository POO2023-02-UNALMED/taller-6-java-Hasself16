package vehiculos;

public class Camion extends Vehiculo{
	private static int cantidadCamiones=0;
	private int ejes;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes=ejes;
		cantidadCamiones++;
	}
	
	public int getEjes() {
		return (this.ejes);
	}
	
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
	
	public static int getCantidadCamiones() {
		return (Camion.cantidadCamiones);
	}
}
