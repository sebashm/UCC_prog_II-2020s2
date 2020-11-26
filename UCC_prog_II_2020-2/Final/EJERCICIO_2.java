package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_2 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String  a,b = "";
    	int an,bn =0;
    	Scanner scan = new Scanner (System.in); 
    	
    	System.out.println("Digite un número: ");
    	a =scan.next();
    	an= Integer.parseInt(a); 
    	
    	System.out.println("Digite un número: ");
    	b= scan.next();
    	bn= Integer.parseInt(b); 
    	
    	int resultadosuma = (int) an+bn; 
    	int resultadoresta = (int) an-bn; 
    	int resultadoproducto = (int) an*bn; 
    	double resultadopromedio = (double) ((an+bn))/2; 
    	
    	System.out.println("La suma es: " + resultadosuma);
    	System.out.println("La resta es: " +resultadoresta);
    	System.out.println("El producto es: " +resultadoproducto);
    	System.out.println("El promedio es: " +resultadopromedio);
    	
 }
}