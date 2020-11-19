package CICLOS;

import java.util.Scanner;

public class EJERCICIO_1 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 15/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String num;
    	int invnum, inv;
    	int numin=0;
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Digite un número: ");
    	num=scan.next();
    	invnum= Integer.parseInt(num);
    	scan.reset();
    	
    	while (invnum > 0) {
    		inv= invnum % 10; 
    		numin= numin*10+inv;
    		invnum /=10;
    		
    }
    System.out.println("Número invertido: "+numin);	
	}
}
