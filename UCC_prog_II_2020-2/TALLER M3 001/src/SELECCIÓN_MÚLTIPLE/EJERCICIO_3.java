package SELECCIÓN_MÚLTIPLE;

import java.util.Scanner;

public class EJERCICIO_3 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 08/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String ubicacion, tamaño; 
    	int ubica, tama, costo; 
    	Scanner scan= new Scanner (System.in);
    	
    	System.out.println("Digite la ubicacion norte (1), sur (2), oriente (3), occidente (4): ");
    	ubicacion= scan.next();
    	ubica= Integer.parseInt(ubicacion);
    	scan.reset();
    	
    	System.out.println("Digite el tamaño pequeño (11), mediano (12), grande (13): ");
    	tamaño= scan.next();
    	tama= Integer.parseInt(tamaño);
    	scan.reset();
    	
    	switch (tama) {
    	case 11:
    		switch (ubica) {
    		case 1: costo=500;
    		case 2: costo=400;
    		case 4: costo=300;
    	break; 
    		}
    	
    	case 12:
    		switch (ubica) {
    		case 1: costo=250;
    		case 2: costo=200;
    	break;
    		}
    		
    		switch (ubica) {
        	case 3: costo=100;
        	break;
        	default:
            	costo=0;
            }
    	case 13:
    		switch (ubica) {
    		case 1: costo=100;
    		case 4: costo=200;
    	break;
    		}
    
    default:
    	costo=0;
    	System.out.println("Concepto invalido: ");
    	
    	}
    	System.out.println("El beneficio a la comunidad es de:$ "+costo);
    	}
	}
  	
 

