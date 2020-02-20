package Ejemplo02;

public class Producto {
	
	private String nombre;
	private int cant;
	private int precio;
	
	public Producto() {

	}
	
	public Producto(String nombre, int cant, int precio) {
		super();
		this.nombre = nombre;
		this.cant = cant;
		this.precio = precio;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int calcular() {
		return cant;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cant=" + cant + ", precio=" + precio + "]";
	}

}
