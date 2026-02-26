package ro.ase.seminar2.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.AngajatiReader;
import ro.ase.seminar2.clase.readers.AplicantiReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			AplicantiReader aplicantReader= new AngajatiReader();
			listaAplicanti = aplicantReader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
