package Innlevering2;

import static javax.swing.JOptionPane.*;

public class Oppg5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			String score;
			int poeng;
			String karakter = "A,B,C,D,E,F";
		
			
			do {
				score = showInputDialog("Poeng");
				poeng = Integer.parseInt(score);
				if(poeng < 0 || poeng > 100) {
					showMessageDialog(null,"Ugyldig poengsum, \nPrøv igjen.");
				}
			} 	while (poeng < 0 || poeng >100 || score.isEmpty());
			
			
			if(poeng >= 0 && poeng <= 100) {
			
				if(poeng >= 0 && poeng <= 39) {
					karakter = "F";
				}
				else if(poeng >= 40 && poeng <= 49) {
					karakter = "E";
				}
				else if(poeng >= 50 && poeng <= 59) {
					karakter = "D";
				}
				else if(poeng >= 60 && poeng <= 79) {
					karakter = "C";
				}
				else if(poeng >= 80 && poeng <= 89) {
					karakter = "B";
				}
				else if(poeng >= 90 && poeng <= 100) {
					karakter = "A";
				}
				showMessageDialog(null,karakter);
			}

		}
				
	}

}
