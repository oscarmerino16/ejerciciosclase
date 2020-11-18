package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_8 {

	public static void main(String[] args) {
		
		int cont=0,num=-1, may=num, min=num;
		
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num= leer.nextInt();
		may=num;
		min=num;
		
		while (cont<=3) {
			System.out.println("Dime un numero");
			num= leer.nextInt();
			
			if(num !=0) {
				if (num>may) {
					may=num;
				}
				if (num<min) {
					min=num;
				}	
			}
			
			cont=cont+1;
		}
		System.out.println("El numero mas grande es " + may);
		System.out.println("El numero mas peque�o es " + min);
	}

}
