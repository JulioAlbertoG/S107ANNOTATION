package nivell1exercici2;

public class Treballador {
	private String nom;
	private String cognom;
	private double preu_hora;
	
	public Treballador(String nom, String cognom, double d) {
		this.nom=nom;
		this.cognom=cognom;
		this.preu_hora=d;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public double getPreu_hora() {
		return preu_hora;
	}

	public void setPreu_hora(double preu_hora) {
		this.preu_hora = preu_hora;
	}
	
	public double calcularSou(double hores,double kms) {
		double souFinal= hores*preu_hora;
		return souFinal;
	}
	@Deprecated
	public String mostrarDades() {
		return "El nom i cognom del treballador no presencial és " + getNom() + getCognom();
	}
	
}
