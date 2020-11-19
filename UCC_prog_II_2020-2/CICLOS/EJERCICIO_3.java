package CICLOS;

import java.util.Scanner;

public class EJERCICIO_3 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 15/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();
    	
    	int numero;
    	int faltante;
    	int numInv;
    	int restante;
    	
    		Scanner scan=new Scanner(System.in);
    		
    		System.out.println("Digite un numero: ");
            numero=scan.nextInt();
    		
    		faltante=numero;
    		numInv=0;
    		restante=0;
    		
    		while(faltante!=0) {
           
    	    restante=faltante%10;
            numInv=numInv*10+restante;
            faltante=faltante/10;
    		
    		}
    		
    	    if(numInv==numero){
    			
            System.out.println("El número es capicua");
            
    		}
    	    
    	    else {
           
            System.out.println("El numero no es capicua");
    		
    		}
    		
    	}
   }

    
    
