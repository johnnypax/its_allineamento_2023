package its.lez04.oop.recap;

public class App {

	public static void main(String[] args) {

		Automobile au = new Automobile();
		au.setMarca("Audi");
		au.setModello("A3");
		au.setCilindrata(2500);
		au.stampaDetaglio();
	
		Automobile due = new Automobile("Peugeot", "208", 1500);
		due.stampaDetaglio();
		
		Automobile tre = new Automobile("Renault", "Clio");
		tre.setCilindrata(1200);
		tre.stampaDetaglio();
		
		Automobile quat = new Automobile("Renault", 2500);
		quat.stampaDetaglio();
	}

}
