package ro.ase.seminar2.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.AngajatiReader;
import ro.ase.seminar2.clase.readers.AplicantiReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		Aplicant.setPragPunctaj(85);
		try {
			AplicantiReader aplicantReader= new AngajatiReader("angajati.txt");
			listaAplicanti =aplicantReader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
