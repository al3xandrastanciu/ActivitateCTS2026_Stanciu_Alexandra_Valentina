package ro.ase.seminar2.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder("Elevul { ");
		sb.append(super.toString());
		sb.append("Clasa= ");
		sb.append(this.clasa);
		sb.append(" Tutore= ");
		sb.append(this.tutore);
		sb.append( " }");
		return sb.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public void afisareVenit() {

		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Elev.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
