package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la variable que introduzca el usuario
		int n = 0;

		// Creo una variable que me sirva para parar el do while
		boolean error;

		// Creo un contador para las cifras pares y otro para las cifras impares
		int contPares = 0;
		int contImpares = 0;

		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario un número para comprobar cuantas cifras pares y cuantas
		// impares tiene y lo guardo en la variable
		do {
			error = false;
			System.out.println("Introduzca un número para saber cuantas cifras pares y cuantas cifras impares tiene: ");
			// Compruebo que el número sea un entero, si no lo es, se lanzará una excepción
			// y se queda en el bucle
			try {
				n = reader.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un número entero.");
				error = true;
			}
			reader.nextLine();
		} while (error);

		// Creo una copia del número introducido y la voy dividiendo entre 10 para
		// eliminar la última cifra hasta que sea 0 (no entrará en el for), hago el
		// módulo 2 para saber si la última cifra es par o impar
		for (int numTemp = n; numTemp > 0; numTemp /= 10) {
			if (numTemp % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		System.out.println("Ese número tiene " + contPares + " cifras pares y " + contImpares + " cifras impares.");
		// Cerramos el escáner
		reader.close();

	}

}
