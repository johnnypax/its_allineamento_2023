package its.lez01.cicli;

import java.util.Scanner;

public class CicloIput {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		
		boolean inserimentoAbilitato = true;
		
		while(inserimentoAbilitato) {
			System.out.println("Scegli l'operazione e premi Q per uscire");
			
			String operazione = interceptor.nextLine();

			if(operazione.equals("Q"))
				inserimentoAbilitato = false;
			
			System.out.println("Hai scelto: " + operazione);
		}
		
		System.out.println("Programma terminato");
		
	}

}
