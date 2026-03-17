package ro.ase.seminar2.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata=10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat() {
		super();
		
	}

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {

		StringBuilder sb= new StringBuilder("Angajatul { ");
		sb.append(super.toString());
		sb.append("Ocupatie= ");
		sb.append(this.ocupatie);
		sb.append(" Salariu= ");
		sb.append(this.salariu);
		sb.append( " }");
		return sb.toString();

	}
	
	
	public void afisareVenit() {

		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+Angajat.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
