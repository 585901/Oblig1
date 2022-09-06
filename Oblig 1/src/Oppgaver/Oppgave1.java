package Oppgaver;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Oppgave1 {
	
	//Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 190349; i++) {
			int bruttoinntekt = Integer.parseInt(showInputDialog("Tast inn din bruttoinntekt"));
			double trinnskatt = (bruttoinntekt);

			if (bruttoinntekt < 190349) {
				trinnskatt = (bruttoinntekt * (0.00 / 100));

			}

			else if (bruttoinntekt >= 190350 && bruttoinntekt <= 267899) {
				trinnskatt = (bruttoinntekt * (1.7 / 100));

			}

			else if (bruttoinntekt >= 267900 && bruttoinntekt <= 643799) {
				trinnskatt = (bruttoinntekt * (4.0 / 100));
			}

			else if (bruttoinntekt >= 643800 && bruttoinntekt <= 969199) {
				trinnskatt = (bruttoinntekt * (13.4 / 100));
			}

			else if (bruttoinntekt >= 969200 && bruttoinntekt <= 1999999) {
				trinnskatt = (bruttoinntekt * (16.4 / 100));
			}

			else if (bruttoinntekt >= 2000000) {
				trinnskatt = (bruttoinntekt * (17.4 / 100));
			}

			if (bruttoinntekt < 0) {
				showMessageDialog(null, "Ikke godkjent");

			}

			showMessageDialog(null, "Trinnskatten din blir: " + trinnskatt + "kr");

		}
	}
}
