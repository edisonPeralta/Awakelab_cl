package Ejemplo02;

public class Perecedero extends Producto{

	private int dias_caduca;	
	
	public Perecedero(String nombre, int cant, int precio, int dias_caduca) {
		super(nombre, cant, precio);
		this.dias_caduca = dias_caduca;
	}

	public Perecedero() {
	}
	
	public int getDias_caduca() {
		return dias_caduca;
	}

	public void setDias_caduca(int dias_caduca) {
		this.dias_caduca = dias_caduca;
	}

	public int reducir_precio(int dias_caduca) {
		
        if (dias_caduca== 1) {
			
			return super.getPrecio()/4;
			
		}else
			
		if (dias_caduca== 2) {
			
			return super.getPrecio()/3;
			
		}else
			
		if (dias_caduca== 3) {
			
			return super.getPrecio()/2;
			
		} else {
			
			return super.getPrecio();
			
		}
        
	}

	@Override
	public int calcular() {
				
	return super.getCant()*reducir_precio(dias_caduca);	
		
	}

}
