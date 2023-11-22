package its.lez07.contenitori;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
//		Contatto[] elenco = new Contatto[3];		//Brutto l'array statico ;(
		
		Contatto gio = new Contatto("Giovanni Pace", "gio@pace.com");
		Contatto val = new Contatto("Valeria Verdi", "val@verdi.com");
		Contatto mar = new Contatto("Mario Rossi", "mario@rossi.com");
		
		ArrayList<Contatto> rubrica = new ArrayList<Contatto>();
		
		rubrica.add(gio);
		rubrica.add(val);
		rubrica.add(mar);
		
		for(int i=0; i<rubrica.size(); i++) {
			Contatto temp = rubrica.get(i);
			
			System.out.println(temp);
		}

	}

}
