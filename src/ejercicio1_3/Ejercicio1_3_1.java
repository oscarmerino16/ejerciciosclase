package ejercicio1_3;

import java.util.Scanner;

public class Ejercicio1_3_1 {

	public static void main(String[] args) {
		
		int vNumeros[] = new int[10]; 
		int num, suma=0, i=0;
		float media=0;
		
		Scanner leer = new Scanner(System.in);
		
		for ( i = 0; i < vNumeros.length; i++) {
			vNumeros[i]=0;
		}
		System.out.println("Dime 10 numeros");
		num=leer.nextInt();
		for ( i = 0; i < vNumeros.length; i++) {
			if (vNumeros[i]==0) {
				System.out.println(vNumeros[i]);
			}
		}
		for ( i = 0; i < vNumeros.length; i++) {
			suma=vNumeros[i]+suma;
		}
		
		//media=vNumeros[i]+suma;
		//System.out.println("La media de los numeros introducidos es " + media);
	}

}
