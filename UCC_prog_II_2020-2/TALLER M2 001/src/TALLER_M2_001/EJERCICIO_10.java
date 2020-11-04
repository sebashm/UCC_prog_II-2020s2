package TALLER_M2_001;

import java.util.Scanner;

public class EJERCICIO_10 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 29/10/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	String a,b,c,d = "";
    	int aN, bN, cN = 0; 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Nombre del empleado: ");
    	String nombre =scan.next();
    	
    	System.out.println("Código del empleado: ");
    	String codigo =scan.next();
    	
    	System.out.println("Valor horas: ");
    	a =scan.next();
    	aN= Integer.parseInt(a);
    	
    	System.out.println("Horas trabajadas: ");
    	b =scan.next();
    	bN= Integer.parseInt(b);
    	
    	if (bN>48) {
    		cN=bN-48;
    	}
    	
    	System.out.println("Total de horas extras: " +cN);
    	
    	int Nrohoras= (int) aN*bN;
    	int valorhoraex= (int) ((aN+(aN*0.2))+cN);
    	int total = (int) Nrohoras+valorhoraex;
    	
    	System.out.println("Total a pagar al empleado es: " +total);
    	
    	}
    	
    	
	} 	

