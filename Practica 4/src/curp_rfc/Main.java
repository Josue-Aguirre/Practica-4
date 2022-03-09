package curp_rfc;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Vector<Mexicano> nuevomexicano = new Vector<>();
		Mexicano captura = new Mexicano();
		Scanner sc = new Scanner(System.in);
		int opcion=' ';
		do 
        {
            System.out.println("Menu\nx) Capturar Usuario \ny) Imprimir Datos \nz) Salir ");
            opcion=sc.next().charAt(0);
            	switch(opcion)
	            {
	            	case 'x':
	            		captura.asignardatos(sc);
	            		nuevomexicano.add(captura);
	            		break;
	            	case 'y':
	            		nuevomexicano.forEach((x) -> 
	            		{
	            		System.out.println(x.toString());
	            		});
	            		break;
	            	case 'z':
	            		System.out.println("¡¡¡Gracias por utilizar este programa!!!");
	            		break;
	            	default:
	            		break;
	            }
           }while(opcion!='z');

	}
}