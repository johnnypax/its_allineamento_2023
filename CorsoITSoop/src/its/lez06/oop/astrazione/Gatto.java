package its.lez06.oop.astrazione;

public class Gatto extends Animale {

	public String coloreOcchi;
	
	public Gatto() {
		
	}
	
	public Gatto(String razza, boolean haIlPelo, int numeroZampe, String coloreOcchi) {
		super();
		super.setRazza(razza);
		super.setHaIlPelo(haIlPelo);
		super.setNumeroZampe(numeroZampe);
		this.coloreOcchi = coloreOcchi;
	}

	public String getColoreOcchi() {
		return coloreOcchi;
	}

	public void setColoreOcchi(String coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}

	@Override
	public void versoEmesso() {
		System.out.println("Miau");
	}
	
	
	
}
