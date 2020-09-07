package Innlevering2;

import static javax.swing.JOptionPane.*;

public class Oppg6 {

	public static void main(String[] args) {
		String heltall = showInputDialog("heltall");
		int n = Integer.parseInt(heltall);
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
			
		}
		
		showMessageDialog(null,sum);

	}

}
