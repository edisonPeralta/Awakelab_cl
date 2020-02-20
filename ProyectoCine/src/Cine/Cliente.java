package Cine;

public class Cliente {

	private int cantEntAdulto;
	private int cantEntNino;
	
	public Cliente() {
		
	}

	public Cliente(int cantEntAdulto, int cantEntNino) {
		this.cantEntAdulto = cantEntAdulto;
		this.cantEntNino = cantEntNino;
	}

	public int getCantEntAdulto() {
		return cantEntAdulto;
	}

	public void setCantEntAdulto(int cantEntAdulto) {
		this.cantEntAdulto = cantEntAdulto;
	}

	public int getCantEntNino() {
		return cantEntNino;
	}

	public void setCantEntNino(int cantEntNino) {
		this.cantEntNino = cantEntNino;
	}
	
	public int compraCliente() {
		return 0;
	}
}
