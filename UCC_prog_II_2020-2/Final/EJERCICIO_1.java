package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_1 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a = "";
    	int n = 0; 
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Digite un numero: ");
    	a = scan.next();
    	n = Integer.parseInt(a);
    	
    	int resultado = (int) Math.pow(n, 3);
    	
    	System.out.println("resultado del número al cubo es: " +resultado);
    	
    	
	}
}
