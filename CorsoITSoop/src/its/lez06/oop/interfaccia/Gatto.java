package its.lez06.oop.interfaccia;

public class Gatto implements Animale{
	
	public boolean haIlPelo;

	public boolean isHaIlPelo() {
		return haIlPelo;
	}

	public void setHaIlPelo(boolean haIlPelo) {
		this.haIlPelo = haIlPelo;
	}

	@Override
	public void versoEmesso() {
		System.out.println("Miau");
		
	}

	@Override
	public void modoLocomozione() {
		System.out.println("Cammina");
	}
	
	

}
