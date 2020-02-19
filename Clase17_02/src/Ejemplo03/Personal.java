package Ejemplo03;

public abstract class Personal {
	
	private String nombre;
	private int edad;
	private int salario;
	int PLUS = 50000;

	public Personal() {
		
	}
	
	public Personal(String nombre, int edad, int salario, int pLUS) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		PLUS = pLUS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public abstract int plus();

}
