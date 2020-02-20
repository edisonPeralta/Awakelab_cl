package Ejemplo2;

public class Libro extends Publicaciones{
	
	public String nombre;
	public int annoPrestamo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnnoPrestamo() {
		return annoPrestamo;
	}

	public void setAnnoPrestamo(int annoPrestamo) {
		this.annoPrestamo = annoPrestamo;
	}

	
	
	public Libro(boolean prestado) {
		super(prestado);
	}

}
