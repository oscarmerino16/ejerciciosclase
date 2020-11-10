package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_5 {

	public static void main(String[] args) {
		
		String letra1;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe S o N no se admite ningun caracter mas");
		letra1 = leer.next();
		
		while (letra1=="S" || letra1=="N") {
			System.out.println("Esas letras estan permitidas");
		}
		if (letra1!="S" || letra1!="N") {
			System.out.println("Error");
		}

	}

}
