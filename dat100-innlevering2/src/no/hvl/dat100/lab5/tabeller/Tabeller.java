package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", " );
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String linje = "[";
		for(int i = 0; i < tabell.length; i++) {
			if(i < tabell.length-1) {
				linje += tabell[i] + ",";
			}else
				linje += tabell[i];
		}

		linje += "]";
		return linje;	
	}

	// c)
	public static int summer(int[] tabell) {
		
		//*********************for løkke************************
		/*
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		System.out.println(sum + ", ");
		return sum;
		
		*/
		
		//**********************while løkke**********************
		
		/*
		int sum = 0;
		int i = 0;
		while(i < tabell.length){
			sum += tabell[i];
			i++;
		}
		System.out.println(sum);
		return sum;
		
		*/
		
		//******************Utvidet, for løkke********************
		
		int sum = 0;
		for(int i : tabell) {
			sum += i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finst = false;
		
		for(int i : tabell) {
			if(i == tall) {
				finst = true;
			}
		}
		return finst;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		
		int[] nyTabell = new int[tabell.length]; 
		for(int i = 0; i < tabell.length; i++) {
			nyTabell[tabell.length-1-i] = tabell[i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		for(int i = 0; i < tabell.length-1; i++) {
			if(tabell[i] > tabell[i+1]) {
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for(int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for(int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length +j] = tabell2[j];
		}
		return nyTab;
	}
}
