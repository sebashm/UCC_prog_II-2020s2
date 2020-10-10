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
	Escribir "Cuántos pedazos dio algepan: ", algepan; 
	Escribir "Cuántos pedazos dio divipan: ", divipan; 
	Escribir "Cuántos pedazos se comió el hombre rico: ", panes;
	Escribir "Cuántas monedas recibió algepan: ", algepan; 
	Escribir "Cuántas monedas recibió divipan: ", divipan; 
	Escribir "Cuántas monedas entregó el hombre rico: ", algepan + divipan; 
	
	
FinAlgoritmo