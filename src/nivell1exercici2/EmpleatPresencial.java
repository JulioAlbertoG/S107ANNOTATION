package nivell1exercici2;

public class EmpleatPresencial extends Treballador {

	private static double souFinal;
	
	public EmpleatPresencial(String nom,String cognom, double preu_hora) {
		super(nom,cognom,preu_hora);
		
		
	}
	


	@Override
	public double calcularSou(double hores,double kms) {
		double preu_km = 0.5;
		souFinal= (hores*getPreu_hora()) + (preu_km*kms);
		return souFinal;
	}
	
	@Deprecated
	public String mostrarDades() {
		return "El nom i cognom del treballador presencial és " + getNom() + getCognom();
	}
	


	
}
	
	


