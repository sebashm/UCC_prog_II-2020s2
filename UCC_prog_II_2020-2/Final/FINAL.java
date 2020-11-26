import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class FINAL {
	public static void main (String[] args) {

		System.out.println();
    	System.out.println("|-------------------------------|");
    	System.out.println("|   Autor: Sebastián Hoyos      |");
    	System.out.println("|    Fecha: 25/11/2020          |");
    	System.out.println("|  Herramientas Computacionales |");
    	System.out.println("|-------------------------------|");
    	System.out.println();

    	int elegir;
    	char otro;
    	String programa="",ruta="E:\\Final\\";

    	Scanner leer = new Scanner(System.in);

    	do {
    	System.out.println("EJERCICIO_1");
    	System.out.println("EJERCICIO_2");
    	System.out.println("EJERCICIO_3");
    	System.out.println("EJERCICIO_4");
    	System.out.println("EJERCICIO_5");
    	System.out.println("EJERCICIO_6");
    	System.out.println("EJERCICIO_7");
    	System.out.println("EJERCICIO_8");
    	System.out.println("EJERCICIO_9");
    	System.out.println("EJERCICIO_10");
    	System.out.println("EJERCICIO_11");
    	System.out.println("EJERCICIO_13");
    	System.out.println("EJERCICIO_14");
    	System.out.println("Digite el ejercicio a elegir");

    	elegir=leer.nextInt();

    	switch (elegir) {

    	case 1:
    		programa="EJERCICIO_1";
    		break;
    	case 2:
    		programa="EJERCICIO_2";
    		break;
    	case 3:
    		programa="EJERCICIO_3";
    		break;
    	case 4:
    		programa="EJERCICIO_4";
    		break;
    	case 5:
    		programa="EJERCICIO_5";
    		break;
    	case 6:
    		programa="EJERCICIO_6";
    		break;
    	case 7:
    		programa="EJERCICIO_7";
    		break;
    	case 8:
    		programa="EJERCICIO_8";
    		break;
    	case 9:
    		programa="EJERCICIO_9";
    		break;
    	case 10:
    		programa="EJERCICIO_10";
    		break;
    	case 11:
    		programa="EJERCICIO_11";
    		break;
    	case 13:
    		programa="EJERCICIO_13";
    		break;
    	case 14:
    		programa="EJERCICIO_14";
    		break;
}
    	try
    {
        var processBuilder = new ProcessBuilder();
        processBuilder.command("java ","E:\\Final\\"+programa+".java");
        var process = processBuilder.inheritIO().start();
        var ret = process.waitFor();

    }
    catch (Exception e)
    {
      System.out.println(e);
    }
      System.out.print("Desea continuar con otro programa? (S o N) ");
      otro = leer.next().charAt(0);
    } while(otro=='s'||otro=='S');
    }
    }
