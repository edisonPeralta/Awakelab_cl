package Oscurilandia;

public abstract class Carro {

	private int cantidadOcup; // cantidad de agentes que lleva dentro
	private String fechaingreso; //fecha de ingreso del carro
	private int ubicaciónTableroF; //Ubicación de carro en fila del tablero
	private int ubicaciónTableroC; // Ubicación de carro en columna del tablero
	
	public Carro() {		
	}

	public Carro(int cantidadOcup, String fechaingreso, int ubicaciónTableroF, int ubicaciónTableroC) {
		this.cantidadOcup = cantidadOcup;
		this.fechaingreso = fechaingreso;
		this.ubicaciónTableroF = ubicaciónTableroF;
		this.ubicaciónTableroC = ubicaciónTableroC;
	}

	public int getCantidadOcup() {
		return cantidadOcup;
	}

	public void setCantidadOcup(int cantidadOcup) {
		this.cantidadOcup = cantidadOcup;
	}

	public String getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public int getUbicaciónTableroF() {
		return ubicaciónTableroF;
	}

	public void setUbicaciónTableroF(int ubicaciónTableroF) {
		this.ubicaciónTableroF = ubicaciónTableroF;
	}

	public int getUbicaciónTableroC() {
		return ubicaciónTableroC;
	}

	public void setUbicaciónTableroC(int ubicaciónTableroC) {
		this.ubicaciónTableroC = ubicaciónTableroC;
	}
	
	public String toString() {
		return "Carro [la cantidad de ocupantes de esta trupalla es= " + cantidadOcup + ", su fecha de ingreso= " + fechaingreso + ", su fila= "
				+ ubicaciónTableroF + ", su columna =" + ubicaciónTableroC + "]";
	}
	
	public abstract void datosCarro();
	
}