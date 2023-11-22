package its.lez05.oop.ereditarieta;

public class App {

	public static void main(String[] args) {
		
		Persona per = new Persona();
		per.setNome("Giovanni");
		per.setCognome("Pace");
		
		System.out.println(per);
		
		Studente stu = new Studente("Valeria", "Verdi", "AB1234");
		System.out.println(stu);
		
		
	}

}
