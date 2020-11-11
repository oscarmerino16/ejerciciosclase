package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_7 {

	public static void main(String[] args) {
		
		int cont=1, par=0, impar=0;
		
		Scanner leer = new Scanner(System.in);
		
		while (cont<=100) {
			System.out.println(cont);
		
		if (cont%2==0) {
			par=par+cont;
		}else {
			impar=impar+cont;
		}
		cont=cont+1;
		}
		System.out.println("La suma de los pares es " + par);
		System.out.println("La suma de los impares es " + impar);
	}

}
