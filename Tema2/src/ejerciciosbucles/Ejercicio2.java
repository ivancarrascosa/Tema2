package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;

		// Creo una variable divisible para saber si el número es o no divisible
		boolean divisible;

		// Creo un contador para la cantidad de números primos, lo inicializo en 1,
		// porque el 1 siempre va a estar incluido al no contar como primo
		int contDivisibles = 1;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario que introduzca un número y lo almaceno en la variable
		System.out.println("Introduzca un número para saber cuantos primos hay menores o iguales que este:");
		n = reader.nextInt();

		// Creo un bucle for que compruebe de 1 hasta n y haga un contador de cuantos
		// números son primos
		for (int i = 2; i <= n; i++) {
			divisible = false;
			// En este bucle con cada i hasta n compruebo si es primo
			for (int j = 2; j <= i / 2 && !divisible; j++) {
				if (i % j == 0) {
					divisible = true;
				}
				// En caso de salir del bucle (no es primo) le sumo 1 al contador
				if (divisible) {
					contDivisibles++;
				}
			} 
		}
		System.out.println("Hay " + (n - contDivisibles) + " números primos desde 1 hasta " + n +".");
		
		//Cerramos el escáner
		reader.close();
	}

}
