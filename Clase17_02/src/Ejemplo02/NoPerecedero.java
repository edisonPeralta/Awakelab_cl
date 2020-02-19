package Ejemplo02;

public class NoPerecedero extends Producto{
	
	private String Tipo;

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public int calcular() {
		return super.getCant()*super.getPrecio();
	}

}
