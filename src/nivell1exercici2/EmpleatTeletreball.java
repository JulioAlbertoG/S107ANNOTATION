package nivell1exercici2;

public class EmpleatTeletreball extends Treballador {

	public EmpleatTeletreball(String nom,String cognom, double preu_hora) {
		super(nom,cognom,preu_hora);
		
	}
	
	@SuppressWarnings(value = { "deprecation" })
	public void mostrarInfo() {
		mostrarDades();
		
	}

}
