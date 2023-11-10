package its.lez01.controlli;

public class ControlliSemplici {

	public static void main(String[] args) {

		/*
		 		if(condizione){
		 			//Sottoprogramma in caso positivo
		 		}
		 		else{
		 			//Sottoprogramma in caso negativo
		 		}
		 */
		
//		System.out.println("Inizio programma");
//		
//		if(false) {
//			System.out.println("Sono nel caso positivo");
//		}
//		else {
//			System.out.println("SOno nel caso negativo");
//		}
//		
//		System.out.println("Fine programma");
		
		//------------------------------------------------
		
		// > 	Maggiore
        // >= 	Maggiore o uguale
        // < 	Minore
        // <=	Minore o uguale
        // ==	Uguale a
        // !=	Diverso da
		
//		System.out.println(5 != 3);
		
		//------------------------------------------------

//		int eta = -18;
//		
//		if(eta >= 18) {
//			System.out.println("Sei maggiorenne");
//		} 
//		else {
//			System.out.println("Sei minorenne");
//		}
		
		//------------------------------------------------

//		int eta = 15;
//		
//		if(eta > 0) {
//			if(eta < 130) {
//				if(eta >= 18) {
//					System.out.println("Sei maggiorenne");
//				} 
//				else {
//					System.out.println("Sei minorenne");
//				}
//			}
//			else {
//				System.out.println("Errore nell'età");
//			}
//		}
//		else {
//			System.out.println("Errore nell'età");
//		}
		
		//------------------------------------------------

		//AND
		
		//int eta = 15;
		//  TRUE   &&   TRUE        = TRUE
		//    1     *      1        = 1
		
		//int eta = -15;
		//  FALSE  && TRUE          = FALSE
		//      0   *    1          = 0
		
//		int eta = 240;
//		//   TRUE  &&  FALSE        = FALSE
//		//	    1   *      0        = 0
//		if(eta > 0 && eta < 130) {
//			System.out.println("Controllo maggiorenne minorenne");
//		}
//		else {
//			System.out.println("Errore nell'età");
//		}
		
		//------------------------------------------------

		//OR
		
		//int eta = -19;
		//  TRUE    ||    FALSE       = TRUE
		//     1     +        0       = 1
		
		//int eta = 240;
		//   FALSE  ||    TRUE        =  TRUE
		//       0   +       1        = 1
		
		int eta = 19;
		//   FALSE	||    FALSE		= FALSE
		//       0   +        0     = 0
		if(eta <= 0 || eta >= 130) {
			System.out.println("Errore nell'età");
		}
		else {
			System.out.println("Controllo maggiorenne minorenne");
		}
	}

}
