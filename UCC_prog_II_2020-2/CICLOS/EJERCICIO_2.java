package CICLOS;

import java.util.Scanner;

public class EJERCICIO_2 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebasti�n Hoyos      |");
    	System.out.println("|    Fecha: 15/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	int num;
    	int resultado=0; 
    	Scanner scan= new Scanner (System.in);
    	
    	System.out.println("Digite un n�mero: ");
    	num=scan.nextInt();
    	
    	while (num > 0) {
    		resultado += num % 10; 
    		num = num/10;
    		
    	}
    	System.out.println("La suma total es: "+resultado);
	}
}
