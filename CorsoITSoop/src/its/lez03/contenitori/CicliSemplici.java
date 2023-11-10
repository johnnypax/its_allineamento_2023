package its.lez03.contenitori;

public class CicliSemplici {

	public static void main(String[] args) {

//		int[] elenco_numeri = new int[5];
//		
//		elenco_numeri[0] = 55;
//		elenco_numeri[1] = 87;
//		elenco_numeri[2] = 22;
//		elenco_numeri[3] = 34;
//		elenco_numeri[4] = 22;
//		
//		for(int i=0; i < elenco_numeri.length; i++) {
//			System.out.println(elenco_numeri[i]);
//		}
//		
//		
////		System.out.println( elenco_numeri[0] );
////		System.out.println( elenco_numeri[1] );
////		System.out.println( elenco_numeri[2] );
////		System.out.println( elenco_numeri[3] );
		
		String[] elenco = new String[3];
		
		elenco[0] = "Giovanni";
		elenco[1] = "Valeria";
//		elenco[2] = 7;
//		elenco[3] = "Marika";		//Problema, out of bounds
		
		for(int i=0; i < elenco.length; i++) {
			System.out.println(elenco[i]);
		}
	}

}
