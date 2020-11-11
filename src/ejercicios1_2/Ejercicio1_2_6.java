package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_6 {

	public static void main(String[] args) {
		
		int cont=1, num=0;
		
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime un numero y te dire los multiplos de 3 desde el 1 hasta ese numero");
		num= leer.nextInt();
		
		while (cont<=num) {
			if (cont%3==0) {
				System.out.println(cont);
			}
			cont=cont+1;
		}
	
	
	
	
	}

}
