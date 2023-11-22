package its.lez06.oop.interfaccia;

public class Coccodrillo implements Animale{
	
	private String colore;
	
	

	public Coccodrillo(String colore) {
		super();
		this.colore = colore;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public void versoEmesso() {
		System.out.println("Non c'è nessuno che lo sa!");
	}

	@Override
	public void modoLocomozione() {
		System.out.println("Cammina e nuota");
	}

}
