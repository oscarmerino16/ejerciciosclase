package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_5 {

	public static void main(String[] args) {
		
		String letra1="";
		Scanner leer = new Scanner(System.in);
		
		
		while (!(letra1.equalsIgnoreCase("S") || letra1.equalsIgnoreCase("N"))) {
			System.out.println("Escribe S o N no se admite ningun caracter mas");
			letra1 = leer.next();
			if (!letra1.equalsIgnoreCase("S") || letra1!="N") {
				System.out.println("Error");
				
			}
			
			
		}
		System.out.println("Esas letras estan permitidas");
		
	}

}
