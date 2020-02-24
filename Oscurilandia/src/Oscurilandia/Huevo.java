package Oscurilandia;

public class Huevo {
	
	String fila;
	String columna;
	int puntaje;
	
	public Huevo() {
		
	}
	
	public Huevo(String fila, String columna, int puntaje) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public String getColumna() {
		return columna;
	}

	public void setColumna(String columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}
	
}
