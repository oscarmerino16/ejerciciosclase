package ejercicios1_2;

public class Ejercicio1_2_4 {

	public static void main(String[] args) {
		
		int num=100, suma=0;
		
		while (num>0) {
			suma=suma+num;
			num=num-1;
		}
		
		System.out.println("La suma de los 100 numeros es " + suma);
	}

}
