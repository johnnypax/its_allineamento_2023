package its.lez06.oop.interfaccia;

public class Pesce implements Animale{

	@Override
	public void versoEmesso() {
		System.out.println("° ° °");
	}

	@Override
	public void modoLocomozione() {
		System.out.println("Nuota");
	}

}
