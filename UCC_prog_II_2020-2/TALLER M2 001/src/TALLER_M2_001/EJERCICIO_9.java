package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_9 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a,b= "";
    	int aN, suma = 0; 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Digite el número: ");
    	a= scan.next();
    	aN= Integer.parseInt(a);
    	
    	while (aN>0) {
    		suma= suma+aN%10;
    		aN= aN/10;
    		}
    	
    	System.out.println("La suma de las cifras iniciales es: " +suma);
    	
	}  	
}
