package SELECCIÓN_MÚLTIPLE;

import java.util.Scanner;

public class EJERCICIO_5 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 08/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String servicio, utilidades, rutas;
    	int ruta=0;
    	double utilidad=0, costo=0;
    	Scanner scan=new Scanner (System.in);
    	
    	System.out.println("Digite el servicio que desea (corriente), (ejecutivo): ");
    	servicio=scan.next();
    	scan.reset();
    	
    	System.out.println("Digite el número de la ruta: ");
    	rutas=scan.next();
    	ruta=Integer.parseInt(rutas);
    	scan.reset();
    	
    	switch (servicio) {
    		case "corriente": costo=200;
    			switch (ruta) {
    				case 1: utilidad= costo - ((costo*0.3)+(costo*0.1));
    				break;
    				case 2: utilidad= costo - ((costo*0.25)+(costo*0.15));
    				break;
    				case 3: utilidad= costo - ((costo*0.2)+(costo*0.2));
    				break;
    				case 4: utilidad= costo - ((costo*0.22)+(costo*0.20));
    				break;
    			}
    				break;
    			
    		case "ejecutivo": costo=300;
				switch (ruta) {
				case 1: utilidad= costo - ((costo*0.3)+(costo*0.1));
				break;
				case 2: utilidad= costo - ((costo*0.25)+(costo*0.15));
				break;
				case 3: utilidad= costo - ((costo*0.2)+(costo*0.2));
				break;
				case 4: utilidad= costo - ((costo*0.22)+(costo*0.20));
				break;
			}
				break;
				
		default: 
			utilidad=0;
			System.out.println("Concepto invalido: ");
    	}
    	
    	System.out.println("La utilidad para la empresa es: "+utilidad);
			
   	}
}
    	

