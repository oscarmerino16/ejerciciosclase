package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_9 {

	public static void main(String[] args) {
		
		int cont=1, aux=1;
		
		Scanner leer = new Scanner(System.in);

		while (cont<=10) {
			aux=0;
			while (aux<=10) {
				System.out.println(aux);
				aux=aux+1;
			}
			cont=cont+1;
		}
	}

}
