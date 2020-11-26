package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_11 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a = "";
    	int N = 0; 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Digite un número: ");
    	a =scan.next();
    	N= Integer.parseInt(a);
    	
    	int resultado = (int) Math.abs(N);
    	
    	System.out.println("El valor absoluto del número es: " +resultado);
    	
	}  	
}
