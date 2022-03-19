package curp_rfc;

import java.util.Scanner;

public class Residencia {
	public static void opciones() {
		System.out.println(" ----------------------Estado------------------------");
		System.out.println("|  1- AGUASCALIENTES              2- BAJA CALIFORNIA |");
		System.out.println("|  3- BAJA CALIFORNIA SUR         4- CAMPECHE        |");
		System.out.println("|  5- COAHUILA                    6- COLIMA          |");
		System.out.println("|  7- CHIAPAS                     8- CHIHUAHUA       |");
		System.out.println("|  9- DISTRITO FEDERAL           10- DURANGO         |");
		System.out.println("| 11- GUANAJUATO                 12- GUERRERO        |");
		System.out.println("| 13- HIDALGO                    14- JALISCO         |");
		System.out.println("| 15- MEXICO                     16- MICHOACAN       |");
		System.out.println("| 17- MORELOS                    18- NAYARIT         |");
		System.out.println("| 19- NUEVO LEON                 20- OAXACA          |");
		System.out.println("| 21- PUEBLA                     22- QUERETARO       |");
		System.out.println("| 23- QUINTANA ROO               24- SAN LUIS POTOSI |");
		System.out.println("| 25- SINALOA                    26- SONORA          |");
		System.out.println("| 27- TABASCO                    28- TAMAULIPAS      |");
		System.out.println("| 29- TLAXCALA                   30- VERACRUZ        |");
		System.out.println("| 31- YUCATAN                    32- ZACATECAS       |");
		System.out.println("| 33- NACIDO EN EL EXTRANJERO");
		System.out.println(" ----------------------------------------------------");
	}
	public static String s(int rs)
	{
		String res = new String();
		switch(rs)
		{
			case 1:
				res="AS";
				break;
			case 2:
				res="BC";
				break;
			case 3:
				res="BS";
				break;
			case 4:
				res="CC";
				break;
			case 5:
				res="CL";
				break;
			case 6:
				res="CM";
				break;
			case 7:
				res="CS";
				break;
			case 8:
				res="CH";
				break;
			case 9:
				res="DF";
				break;
			case 10:
				res="DG";
				break;
			case 11:
				res="GT";
				break;
			case 12:
				res="GR";
				break;
			case 13:
				res="HG";
				break;
			case 14:
				res="JC";
				break;
			case 15:
				res="MC";
				break;
			case 16:
				res="MN";
				break;
			case 17:
				res="MS";
				break;
			case 18:
				res="NT";
				break;
			case 19:
				res="NL";
				break;
			case 20:
				res="OC";
				break;
			case 21:
				res="PL";
				break;
			case 22:
				res="QT";
				break;
			case 23:
				res="QR";
				break;
			case 24:
				res="SP";
				break;
			case 25:
				res="SL";
				break;
			case 26:
				res="SR";
				break;
			case 27:
				res="TC";
				break;
			case 28:
				res="TS";
				break;
			case 29:
				res="TL";
				break;
			case 30:
				res="VZ";
				break;
			case 31:
				res="YN";
				break;
			case 32:
				res="ZS";
				break;
			case 33:
				res="NE";
				break;
		}
		return res;
	}
	
}
