package Innlevering2;

public class Oppg4 {

	public static void main(String[] args) {
		int inntekt = 180800;
		double sats = 0;
		
		if(inntekt < 180800) {
			sats = 0;
		}
		else if(inntekt >= 180800 && inntekt < 254500) {
			sats = 1.9;
		}
		else if(inntekt >= 254500 && inntekt < 639750) {
			sats = 4.2;
		}
		else if(inntekt >= 639750 && inntekt < 999550) {
			sats = 13.2;
		}
		else if(inntekt >999550) {
			sats = 16.2;
		}
		double skatt = inntekt * sats / 100;
		System.out.println(skatt);
		
	}

}
