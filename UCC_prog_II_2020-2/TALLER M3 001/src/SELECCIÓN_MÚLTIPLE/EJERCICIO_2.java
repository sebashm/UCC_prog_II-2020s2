package SELECCIÓN_MÚLTIPLE;

import java.util.Scanner;

public class EJERCICIO_2 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 08/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String semestre, plan; 
    	int semest, planestudio, costo=0; 
    	Scanner scan= new Scanner (System.in);
    	
    	System.out.println("Digite el programa de estudio administracion (a), ciencias (c), economia (e): ");
    	plan= scan.next();
    	scan.reset();
    	
    	System.out.println("Digite el semestre al que ingresa: ");
    	semestre= scan.next();
    	semest= Integer.parseInt(semestre);
    	scan.reset();
    	
    
    	switch (plan) {
    		case"a":
    			switch (semest) {
    			case 1:
    			case 2:
    			case 3:
    				costo= 2000;
    				break;
    			case 4:
    			case 5:
    			case 6: 
    			case 7:
    				costo= 4000;
    				break;
    			case 8:
    			case 9:
    			case 10:
    				costo= 6000;
    				break; 
    				default:
    					costo=0;
    					System.out.println("Concepto invalido:");
    					}
    			
    			break;
    			
    		case "c":
    			switch (semest) {
    			case 1:
    			case 2:
    			case 3:
    				costo= 1800;
    				break;
    			case 4:
    			case 5:
    			case 6: 
    			case 7:
    				costo= 5000;
    				break;
    			case 8:
    			case 9:
    			case 10:
    				costo= 7000;
    				break; 
    				default:
    					costo=0;
    					System.out.println("Concepto invalido:");
    					}
    			break; 
    			
    		case "e":
    			switch (semest) {
    			case 1:
    			case 2:
    			case 3:
    				costo= 1500;
    				break;
    			case 4:
    			case 5:
    			case 6: 
    			case 7:
    				costo= 2200;
    				break;
    			case 8:
    			case 9:
    			case 10:
    				costo= 3000;
    				break; 
    				default:
    					costo=0;
    					System.out.println("Concepto invalido:");
    					}
    			break; 
    			
    		default: 
    			costo=0;
    			System.out.println("Concepto invalido");
    			
    	}
    	System.out.println("El costo por concepto del carnet es:$ "+costo);
    }
    	
}

    	
 	
 


