package its.lez06.oop.astrazione;

public abstract class Animale {

	private String razza;
	private boolean haIlPelo;
	private int numeroZampe;
	
	
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	public boolean isHaIlPelo() {
		return haIlPelo;
	}
	public void setHaIlPelo(boolean haIlPelo) {
		this.haIlPelo = haIlPelo;
	}
	public int getNumeroZampe() {
		return numeroZampe;
	}
	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}
	
	public abstract void versoEmesso();
	
	
	
}
