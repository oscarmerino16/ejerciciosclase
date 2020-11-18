package ejercicio1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_3_1 {

	public static void main(String[] args) {
		
		float vNumeros[] = new float[10]; 
		Random azar = new Random();
		Scanner leer = new Scanner(System.in);
		float suma=0;
		
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = azar.nextInt(9);
			System.out.print(vNumeros[i]+ " - ");
			suma = suma + vNumeros[i];
		}
		
		
		System.out.println("\nLa suma es "+ suma + " La media es: " + (suma/vNumeros.length));
	}

}
