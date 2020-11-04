package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_14 {
public static void main(String[] args) {
		
		String a,b,c ="";
		int aN = 8+12, bN = 9+11, cN=10+8;
		
		Scanner scan = new Scanner (System.in);
		
		double niña = (double) 1200/aN;
		double pinta = (double) 1200/bN;
		double santamaria = (double) 1200/cN;
		
		System.out.println("Cuantas horas tardó la niña: " +niña);
		System.out.println("Cuantas horas tardó la pinta: " +pinta);
		System.out.println("Cuantas horas tardó la santamaria: " +santamaria);
		
		System.out.println("Las tres embarcaciones llegaron al mismo tiempo?: NO");
		 
 }
}
