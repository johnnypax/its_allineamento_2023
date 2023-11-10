package its.lez04.oop.introduzione;

public class App {

	public static void main(String[] args) {

		Pennarello trattoNero = new Pennarello();
		trattoNero.colore = "Nero";
		trattoNero.marca = "TRATTO VIDEO";
		trattoNero.lunghezza = 15.0f;
		trattoNero.diametro = 1.2f;
		trattoNero.prezzo = 3.5f;
		trattoNero.materiale = "Legno";
//		System.out.println(trattoNero);
		
//		System.out.println( trattoNero.marca );
//		System.out.println( trattoNero.materiale );
		
//		trattoNero.prova();
		
		Pennarello evidenziatore = new Pennarello();
		evidenziatore.colore = "Giallo fluo";
		evidenziatore.marca = "Boh";
		evidenziatore.lunghezza = 12.0f;
		evidenziatore.diametro = 3.2f;
		evidenziatore.prezzo = 2.5f;
//		System.out.println(evidenziatore);
		
		
//		Persona gio = new Persona();
//		gio.saluta("CICCIO");
//		
//		gio.salutaPersona("Giovanni", "Pace", 37);
//		
//		
//		Calcolatrice cal = new Calcolatrice();
//		float risultato = cal.somma(15.1f, 12.2f);
//		
//		System.out.println(risultato);
		
		Persona mario = new Persona();
		mario.nominativo = "Mario Rossi";
		mario.salutaNom();
		
		
		
		
	}

}
