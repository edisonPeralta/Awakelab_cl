package Oscurilandia;

public class Trupalla extends Carro{
	
	private int NivelArm; // nivel de la armadura (1-5)	
	private String NombrePiloto; // Nombre de quien conduce la Trupalla
	
	// Constructores.
	public Trupalla() {	
		super();
	}
	
	public Trupalla(int cantidadOcup, String fechaingreso, int ubicaciónTableroF, int ubicaciónTableroC, int nivelArm, String nombrePiloto) {		
		super(cantidadOcup, fechaingreso, ubicaciónTableroF, ubicaciónTableroC);//atributos		
		this.NivelArm = nivelArm;		
		this.NombrePiloto = nombrePiloto;
	}
		
	// Getters y Setters.
	public int getNivelArm() {
		return NivelArm;
	}

	public void setNivelArm(int nivelArm) {
		NivelArm = nivelArm;
	}

	public String getNombrePiloto() {
		return NombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		NombrePiloto = nombrePiloto;
	}

	@Override
	public void datosCarro() {
			
	}

}
