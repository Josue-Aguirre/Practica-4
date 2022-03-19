package curp_rfc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Mexicano captura = new Mexicano();
		Scanner sc = new Scanner(System.in);
		int opcion=0,salir_menu=0;
		do 
        {
            System.out.println("\nMenu\n1) Crear CURP \n2) Crear RFC \n3) Crear CURP Y RFC \n4) Salir ");
            opcion=sc.nextInt();
            	switch(opcion)
	            {
	            	case 1:
	            		captura.asignardatos(sc);
	            		captura.CreaCurp();
	            		
	            		break;
	            	case 2:
	            		captura.asignardatos(sc);
	            		captura.Crearfc();
	     
	            		break;
	            	case 3:
	            		captura.asignardatos(sc);
	            		captura.CreaCurp();
	            		captura.Crearfc();
	            		
	            		break;
	            	case 4:
	            		System.out.println("¡¡¡¡¡¡¡¡¡Gracias por utilizar el programa!!!!!!!!!");
	            		salir_menu=1;
	            		break;
	            	default:
	            		break;
	            }
           }while(salir_menu==0);

	}
}