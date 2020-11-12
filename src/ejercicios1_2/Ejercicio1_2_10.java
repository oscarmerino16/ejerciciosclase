package ejercicios1_2;

import java.util.Scanner;

public class Ejercicio1_2_10 {

	public static int cuentaLetra(String frase, String letra) {
		
		int cont=0;
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.substring(i,i+1).equalsIgnoreCase(letra)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(cuentaLetra("Hola juan", "a"));
		
		

	}

}
