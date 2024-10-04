package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro la variable a la que voy a asignar el número que va a dar el usuario
		int num;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca un número
		System.out.println("Introduce un número");
		// Guardo ese número
		num = reader.nextInt();
		// Devuelvo si es par o impar utilizando un if else con un módulo
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
			// Cierro el escáner
			reader.close();

		}

	}

}
