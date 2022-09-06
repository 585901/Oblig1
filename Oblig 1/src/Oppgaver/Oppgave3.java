package Oppgaver;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Oppgave3 {
	
	//Lag et program som leser inn et heltall n > 0, 
	//beregner verdien n! (n fakultet) og skriver verdien 
	//til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n
		
		public static void main(String[] args) {
			int n = Integer.parseInt(showInputDialog("Tast inn et heltall")); 
			
			int svar = 1; 
			
			System.out.print(n + "! = "); 
			while(n > 0) { 
				svar = svar*n; 
				n--; 
			}
			System.out.println(svar); 
			
		}
		
	}