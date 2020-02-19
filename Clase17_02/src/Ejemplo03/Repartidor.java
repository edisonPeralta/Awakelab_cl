package Ejemplo03;

public class Repartidor extends Personal{

	private String zona;

	public Repartidor() {
	}

	public Repartidor(String zona) {
		super();
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public int plus() {
		
		if (super.getEdad()<25 & zona=="3") {			
			return true;
		} else {
			return false;
		}
	}
	
}
