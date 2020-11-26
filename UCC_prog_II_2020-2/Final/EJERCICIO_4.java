package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_4 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a,b = "";
    	int aN, bN = 0; 
    	Scanner scan = new Scanner (System.in); 
    	
    	System.out.println("Digite el valor del salario: ");
    	a= scan.next();
    	aN= (int) Double.parseDouble(a);
    	
    	System.out.println("Digite el valor del descuento: ");
    	b= scan.next();
    	bN= (int) Double.parseDouble(b);
    	
    	
    	double valortotal = (double) ((aN-bN));
    	
    	System.out.println("El valortotal es: " +valortotal);
    	
    	
    	
	}  	
}
