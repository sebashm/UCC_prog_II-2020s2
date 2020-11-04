package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_13 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a = "";
    	
    	double porcentaje, Hobbes, Calvin, digite = 0, totalHobbes; 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Digite la cantidad de aceite: ");
    	digite = scan.nextInt();
    	
    	porcentaje= 0.66;
    	Hobbes = digite;
    	totalHobbes= Hobbes*porcentaje; 
    	Calvin= Hobbes - totalHobbes;
    	
    	System.out.println("El total de aceite es: " +digite);
    	System.out.println("El total producido por Calvin es: " +Calvin);
    	System.out.println("El total producido por Hobbes es: " +totalHobbes);
    	
    	
	}  	
}
