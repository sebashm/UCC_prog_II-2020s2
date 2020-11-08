package SELECCIÓN_MÚLTIPLE;

import java.util.Scanner;

public class EJERCICIO_4 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 08/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String producto, unidades;
    	int precio=0, unidad=0;
    	double iva=0;
    	Scanner scan= new Scanner (System.in);
    	
    	System.out.println("Digite el código del producto (a), (b), (c): ");
    	producto=scan.next();
    	scan.reset();
    	
    	System.out.println("Digite la cantidad de unidades: ");
    	unidades= scan.next();
    	unidad= Integer.parseInt(unidades);
    	scan.reset();
    	
    	switch (producto) {
    		case "a":
    				if (unidad >0 && unidad <501)
    				precio=500;
    				else if (unidad>501);
    				precio=1000;
    				break; 
    		case "b":
    			if (unidad >0 && unidad <501)
    				precio=800;
    				else if (unidad>501);
    				precio=1400;
    				break; 
    		case "c":
    			if (unidad >0 && unidad <501)
    				precio=1000;
    				else if (unidad>501);
    				precio=1600;
    				break;
    				
    	default:
    	
    		precio=0;
    		System.out.println("Concepto invalido");
    	}
    	
    	System.out.println("El valor del monto es:$ "+unidad*precio);
    	
    	switch (producto) {
    		case "a":
    			if (unidad >0 && unidad <501)
    				iva= precio + (precio*0.07);
    			else if (unidad>501);
    				iva= precio +(precio*0.09);
			break; 
    		case "b":
    			if (unidad >0 && unidad <501)
    				iva= precio + (precio*0.08);
    			else if (unidad>501);
    				iva= precio +(precio*0.11);
			break; 
    		case "c":
    			if (unidad >0 && unidad <501)
    				iva= precio + (precio*0.05);
    			else if (unidad>501);
    				iva= precio +(precio*0.1);
			break; 
			
		default: 
			precio=0;
    		System.out.println("Concepto invalido");
    	}
    	
    	System.out.println("El valor del monto es:$ "+unidad*iva);
    	
    }
}
    	

