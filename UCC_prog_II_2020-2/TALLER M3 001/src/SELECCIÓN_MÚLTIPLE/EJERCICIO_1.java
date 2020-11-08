package SELECCIÓN_MÚLTIPLE;

import java.util.Scanner;

public class EJERCICIO_1 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 08/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String nombre= "";
    	Scanner scan = new Scanner(System.in);
    	
    	int cate; 
    	double sueldo=0;
    	
    	System.out.println("Digite el nombre del empleado: ");
    	nombre= scan.next();
    	
    	System.out.println("Digite la categoria: ");
    	cate= scan.nextInt();
    	scan.reset();
    	System.out.println("Digite el sueldo:$ ");
    	sueldo= scan.nextDouble();
    	
    	
    	switch (cate) {
    	
    	case 1:
    		sueldo= (int) (sueldo*1.15);
    		break;
    	case 2: 
    		sueldo= (int) (sueldo*1.10);
    		break; 
    	case 3: 
    		sueldo= (int) (sueldo*1.08);
    		break;
    	case 4: 
    		sueldo= (int) (sueldo*1.07);
    		break; 
    		
    	default: 
    		sueldo= 0; 
    		System.out.println("La categoria no existe");
    	}
    		System.out.println("El sueldo a pagar es:$ "+sueldo);
 
    	
	 }
	}

