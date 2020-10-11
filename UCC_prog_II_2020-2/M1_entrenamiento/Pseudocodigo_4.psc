Proceso Pseudocodigo_4 
	//Definir variables
	Definir resp1, resp2, resp3, resp4, k Como Entero;
	
	resp1 <- 1;
	resp2 <- 1;
	resp3 <- 1; 
	resp4 <- 1;
	
	Escribir "¿Benjamin Franklin inventó el pararrayos? (0) Falso, (1) Verdadero: ", resp1; 
	Leer resp1;
	
	Escribir "¿Samuel Morse inventó el telegrafo? (0) Falso, (1) Verdadero: ", resp2; 
	Leer resp2;
	
	Escribir "¿Perú es un país de Suramericano? (0) Falso, (1) Verdadero: ", resp3; 
	Leer resp3; 
	
	Escribir "¿5 es un número primo? (0) Falso, (1) Verdadero: ", resp4; 
	Leer resp4;
	
	si (resp1 >= resp2) y (resp3 == resp4) Entonces
		
		k <- 1;
	SiNo
		k <- 0;
		
	FinSi
	
	Escribir "El valor final vale: ", k;
	
	
	
	
FinProceso
