package its.lez04.oop.incapsulamento;

public class Persona {

	private String nominativo;
	private int eta;

	void setNominativo(String varNomin) {
		nominativo = varNomin;
	}
	
	void setEta(int varEta) {
		if(varEta >= 0)
			eta = varEta;
		else
			varEta = 0;
	}
	
	String getNominativo() {
		return nominativo;
	}
	
	int getEta() {
		return eta;
	}
	
	void stampaDettaglio() {
		System.out.println("nome: " + nominativo + " età: " + eta);
	}
}
