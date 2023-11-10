package its.lez04.oop.introduzione;

public class Persona {

	String nominativo;
	int eta;
	
	void saluta(String frase) {
		System.out.println("CIAO " + frase);
	}
	
	void salutaPersona(String nome, String cognome, int eta) {
		System.out.println(nome + " " + cognome + " " + eta);
	}
	
	void salutaNom() {
		System.out.println(nominativo);
	}
	
}
