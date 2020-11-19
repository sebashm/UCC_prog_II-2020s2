package CICLOS;

import java.util.Scanner;

public class EJERCICIO_6 {
	public static void main (String[] args){
		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 15/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();

       Scanner scan = new Scanner(System.in);
       int a=0,i,n;
       
       System.out.println("Digite un número: ");
       n=scan.nextInt();
       
       for(i=1;i<(n+1);i++){
       if(n%i==0){
           a++;
          }
       }
       if(a!=2) {
            System.out.println("No es Primo");
          }
       else {
              System.out.println("Si es Primo");
       }
   }
}

