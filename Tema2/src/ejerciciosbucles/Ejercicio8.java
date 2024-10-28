package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo una variable para ir guardando los números que introduzca el usuario y
		// se vaya modificando con el número actual
		int n;
		// Creo una variable para almacenar el nuevo número que introduzca el usuario
		int numTemp;
		// Creo una variable para contar el número de veces que se falla
		int fallos = 0;
		// Creo una variable para usarla en el for como contador
		int cont;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario el primer número y lo asigno a la variable creada
		// anteriormente
		System.out.println("Dime un número inicial:");
		n = reader.nextInt();
		// Creo un for en el que se cuente el número de números introducidos (que lo
		// usaré como índice del for)
		// Comienzo el contador en 0, para que después no cuente el bucle en el que la n
		// = 0
		for (cont = 0; n != 0; cont++) {
			System.out.println("Dime un número: ");
			numTemp = reader.nextInt();
			if (numTemp >= n) {
				n = numTemp;
			} else if (numTemp == 0) {
				n = numTemp;
			} else {
				n = numTemp;
				System.out.println("Fallo, es menor.");
				fallos++;
			}
		}
		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Números fallados: " + fallos);
		// Cerramos el escáner
		reader.close();
	}

}
