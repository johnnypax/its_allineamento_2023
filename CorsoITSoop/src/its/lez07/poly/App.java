package its.lez07.poly;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Studente gio = new Studente("Gio", "Pace", "AB1234");
		Studente val = new Studente("Val", "Ver", "AB1235");
		
		Docente doc = new Docente("Mario", "Rossi", "Fisica");
		
//		Persona per = new Persona("CIccio", "Pasticcio");	//Non posso per abstract
		
//		ArrayList<Studente> elencoStud = new ArrayList<Studente>();
//		ArrayList<Docente> elencoDoce = new ArrayList<Docente>();
		
		ArrayList<Persona> elenco = new ArrayList<Persona>();
		
		elenco.add(gio);
		elenco.add(val);
		elenco.add(doc);
//		elenco.add(per);

		for(int i=0; i<elenco.size(); i++) {
			Persona temp = elenco.get(i);
			
			System.out.println(temp);
		}
		
	}

}
