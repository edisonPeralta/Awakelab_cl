package Oscurilandia;

public abstract class Carro {

	private int cantidadOcup; // cantidad de agentes que lleva dentro
	private String fechaingreso; //fecha de ingreso del carro
	private int ubicaci�nTableroF; //Ubicaci�n de carro en fila del tablero
	private int ubicaci�nTableroC; // Ubicaci�n de carro en columna del tablero
	
	public Carro() {		
	}

	public Carro(int cantidadOcup, String fechaingreso, int ubicaci�nTableroF, int ubicaci�nTableroC) {
		this.cantidadOcup = cantidadOcup;
		this.fechaingreso = fechaingreso;
		this.ubicaci�nTableroF = ubicaci�nTableroF;
		this.ubicaci�nTableroC = ubicaci�nTableroC;
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

	public int getUbicaci�nTableroF() {
		return ubicaci�nTableroF;
	}

	public void setUbicaci�nTableroF(int ubicaci�nTableroF) {
		this.ubicaci�nTableroF = ubicaci�nTableroF;
	}

	public int getUbicaci�nTableroC() {
		return ubicaci�nTableroC;
	}

	public void setUbicaci�nTableroC(int ubicaci�nTableroC) {
		this.ubicaci�nTableroC = ubicaci�nTableroC;
	}
	
	public String toString() {
		return "Carro [la cantidad de ocupantes de esta trupalla es= " + cantidadOcup + ", su fecha de ingreso= " + fechaingreso + ", su fila= "
				+ ubicaci�nTableroF + ", su columna =" + ubicaci�nTableroC + "]";
	}
	
	public abstract void datosCarro();
	
}