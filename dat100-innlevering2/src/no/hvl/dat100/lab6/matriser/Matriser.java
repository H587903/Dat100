package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad : matrise) {
			for(int i : rad) {
				System.out.print(i + ",");
			}
			System.out.println("");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String linje = "";
		for(int [] rad : matrise) {
			for(int i : rad) {
				linje += i + " ";
			}
			 linje += "\n";
		}
		return linje;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for(int rad = 0; rad < matrise.length; rad++) {
			for(int i = 0; i < matrise[rad].length; i++) {
				nyMatrise[rad][i] = matrise[rad][i]*tall;
			}
		}
			
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		
		for(int rad = 0; rad < a.length; rad++) {
			for(int i = 0; i < a[rad].length; i++) {
				if(a[rad][i] != b[rad][i]) {
					return false;
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
//
		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
