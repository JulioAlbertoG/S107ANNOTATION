package nivell1exercici1;

public class Ejecutor_e1 {

	public static void main(String[] args) {
		
		
		EmpleatPresencial empleatPresencial = new EmpleatPresencial("Roc","Canmajor",6);
		EmpleatTeletreball empleatTeletreball = new EmpleatTeletreball("Joan","Argo",6);
		
		double sou = empleatPresencial.calcularSou(8,300);
		double sou2 = empleatTeletreball.calcularSou(8,0);
		
		
		System.out.println("El nom i cognom del treballador presencial és " + empleatPresencial.getNom() + empleatPresencial.getCognom() + " i el seu sou és " + sou);
		System.out.println("El nom i cognom del treballador no presencial és " + empleatTeletreball.getNom() + empleatTeletreball.getCognom() + " i el seu sou és " + sou2);
	}

}
