package HOYOS_SEBASTIAN;

import java.util.Scanner;

public class EJERCICIO_4 {
	public static void main (String[] args){
		int l1,l2;
	    boolean bl1=false,bl2=false,k;
	    
	    try (Scanner leer = new Scanner(System.in)) {
			System.out.print("¿Inglaterra es un país suramericano [0]...Falso [1]...Verdad? ");
			l1 = leer.nextInt();
			System.out.print("¿Marie Currie inventó el radio [0]...Falso [1]...Verdad? ");
			l2 = leer.nextInt();
			
			 if (l1!= 0) bl1=false;
			 if (l1!=1)  bl1=true;
			 if (l2!=1)  bl2=true;
			 if (l2!= 0) bl2=false;
			 
			 k= bl1 && bl2;
			    
		 }
	
			
	    System.out.print("El valor de la variable k es: "+k);
    	System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
	}
}
