package CICLOS;

import java.util.Scanner;

public class EJERCICIO_5 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebasti�n Hoyos      |");
    	System.out.println("|    Fecha: 15/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
	Scanner scan = new Scanner(System.in);
	int num1,num2,num3,nummayor = 0;
	
	System.out.print("Digite un n�mero: ");
	num1 = scan.nextInt();
	
	System.out.print("Digite un n�mero: ");
	num2 = scan.nextInt();
	
	System.out.print("Digite un n�mero: ");
	num3 = scan.nextInt();
	
	if (num1 > num2) {
	if (num1 > num3) {
	nummayor = num1;
	} 
	
	else {
	if (num3 > num2) {
	nummayor = num3;
	} 
	
	else {
	if (num2 > num1) {
	nummayor = num2;
	}
	}
	}
	}
	
	else {
	if (num2 > num3) {
	nummayor = num2;
	}
	
	else {
	nummayor = num3;
	 }
	}
	System.out.print("El n�mero mayor es: ");
	System.out.print(nummayor);
	}

	}
