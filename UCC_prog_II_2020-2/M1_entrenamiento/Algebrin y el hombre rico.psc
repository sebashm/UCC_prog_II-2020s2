Algoritmo Alegrin_y_el_hombre_rico
	//Defino variables 
	
	Definir algepan Como Entero;
	Definir divipan Como Entero; 
	Definir panes Como Entero; 
	
	algepan <- 5; 
	divipan <- 3; 
	panes <- algepan + divipan; 
	
	//Proceso
	algepan <- algepan * 3; 
	divipan <- divipan * 3; 
	
	panes <- algepan + divipan; 
	algepan <- algepan - panes / 3; 
	divipan <- divipan - panes / 3;
	panes <- panes / 3;
	
	//Salidas
	Escribir "Cu�ntos pedazos dio algepan: ", algepan; 
	Escribir "Cu�ntos pedazos dio divipan: ", divipan; 
	Escribir "Cu�ntos pedazos se comi� el hombre rico: ", panes;
	Escribir "Cu�ntas monedas recibi� algepan: ", algepan; 
	Escribir "Cu�ntas monedas recibi� divipan: ", divipan; 
	Escribir "Cu�ntas monedas entreg� el hombre rico: ", algepan + divipan; 
	
	
FinAlgoritmo