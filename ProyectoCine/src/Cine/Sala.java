package Cine;

public class Sala {

	private int numSala;
	private int valorAsiento;
	public int cantAsientos;
	
	public Sala() {
		
	}

	public Sala(int numSala, int valorAsiento, int cantAsientos) {
		this.numSala = numSala;
		this.valorAsiento = valorAsiento;
		this.cantAsientos = cantAsientos;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(int valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public int getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	
	public int recaudacionDia() {
		return 0;
	}
}
