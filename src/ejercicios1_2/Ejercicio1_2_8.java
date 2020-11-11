package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_8 {

	public static void main(String[] args) {
		
		int cont=0,num=0, may=num, min=num;
		
		
		Scanner leer = new Scanner(System.in);
		
		while (cont<=4) {
			System.out.println("Dime un numero");
			num= leer.nextInt();
			
			if (num>may) {
				may=num;
			}
			if (num<min) {
				min=num;
			}
			cont=cont+1;
		}
		System.out.println("El numero mas grande es " + may);
		System.out.println("El numero mas pequeño es " + min);
	}

}
