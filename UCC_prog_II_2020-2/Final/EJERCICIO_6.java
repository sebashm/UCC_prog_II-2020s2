package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_6 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a,b,c,d,e,f = "";
    	int aN, bN, cN, dN, eN, fN= 0; 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Nombre de Empleado1: ");
    	String nombre1 = scan.next();
    	
    	System.out.println("Valor hora: ");
    	a = scan.next();
    	aN= Integer.parseInt(a);
    	
    	System.out.println("Horas trabajadas: ");
    	b =scan.next(); 
    	bN= Integer.parseInt(b);
    	
    	int total = (int) aN*bN;
    	
    	System.out.println("Total a pagar al empleado1 es: " +total);
    	
    	System.out.println("Nombre de Empleado2");
    	String nombre2 =scan.next();
    	
    	System.out.println("Valor hora");
    	c =scan.next();
    	cN= Integer.parseInt(c);
    	
    	System.out.println("Horas trabajadas");
    	d= scan.next();
    	dN= Integer.parseInt(d);
    	
    	int total2= (int) cN*dN;
    	
    	System.out.println("Total a pagar al empleado2 es:" +total2);
    	
    	System.out.println("Nombre de empleado3");
    	String nombre3 =scan.next();
    	
    	System.out.println("Valor hora");
    	e= scan.next();
    	eN= Integer.parseInt(e);
    	
    	System.out.println("Horas trabajadas");
    	f= scan.next();
    	fN= Integer.parseInt(f);
    	
    	int total3 = (int) eN*fN;  
    	System.out.println("Total a pagar al empleado3 es:" +total3);
    			
    	
	}   	
}
