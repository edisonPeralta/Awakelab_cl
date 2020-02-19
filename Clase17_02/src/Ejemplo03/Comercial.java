package Ejemplo03;

public class Comercial extends Personal{
	
	private double comision;

	public Comercial() {
	}

	public Comercial(double comision) {
		super();
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public int plus() {
		
		int value = (int)comision;
		
		if (super.getEdad()>30 & comision>200000) {			
			return value + super.PLUS;
		} else {
			return value;
		}
		
	}

}
