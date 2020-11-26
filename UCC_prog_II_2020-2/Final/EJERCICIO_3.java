package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_3 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a,b,c = "";
    	int aN, bN, cN = 0; 
    	Scanner scan = new Scanner (System.in); 
    	
    	System.out.println("Digite la nota1: ");
    	a= scan.next();
    	aN= (int) Double.parseDouble(a);
    	
    	System.out.println("Digite la nota2: ");
    	b= scan.next();
    	bN= (int) Double.parseDouble(b);
    	
    	System.out.println("Digite la nota3: ");
    	c= scan.next();
    	cN= (int) Double.parseDouble(c); 
    	
    	double nota1= (double) aN*0.3; 
    	double nota2 = (double) bN*0.3;
    	double nota3 = (double) cN*0.4;
    	double notadefinitiva = (double) ((nota1+nota2+nota3));
    	
    	System.out.println("La nota1 es: " +nota1);
    	System.out.println("La nota2 es: " +nota2);
    	System.out.println("La nota3 es: " +nota3);
    	System.out.println("La notadefinitiva es: " +notadefinitiva);
    	
	}
}
