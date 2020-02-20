package Ejemplo2;

public class Publicaciones {
	
	private boolean prestado;
	
	public Publicaciones(boolean prestado) {
		this.setPrestado(prestado);
	}

	public boolean cuentaPrestados() {
		return false;
	}
	
	public void publicacionesAnterioresA() {
		
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
}
