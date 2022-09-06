package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 

public class Oppgave2 {
	
	//Lag et program som leser inn en poengsum (heltall) som en student har oppnådd 
	//på en prøve, og finn og skriv ut den karakteren A-F dette tilsvarer. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i ++) {
			
			int poengsum = Integer.parseInt(showInputDialog("Tast inn din poengsum")); 
			String karakter = "Ikke gyldig poengsum"; 
			
			if (poengsum >=0 && poengsum <= 39)
				karakter = "F"; 
			
			if (poengsum >= 40 && poengsum <= 49)
				karakter = "E"; 
			
			if (poengsum >= 50 && poengsum <= 59)
				karakter = "D"; 
			
			if (poengsum >= 60 && poengsum <= 79)
				karakter = "C"; 
			
			if (poengsum >= 80 && poengsum <= 89)
				karakter = "B"; 
			
			if (poengsum >= 90 && poengsum <= 100)
				karakter = "A"; 
			
			if((karakter).equals("Ikke gyldig poengsum"))
				i = i - 1; 
			
			showMessageDialog(null, "Din karakter ble: "+karakter);
		}
	}
}