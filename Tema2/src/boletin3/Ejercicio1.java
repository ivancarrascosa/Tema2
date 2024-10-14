package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo la variable para almacenar el número que me de el usuario
		int num;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca un número y lo guardo en la variable
		System.out.println("Introduzca un número entre 0 y 9999");
		num = reader.nextInt();
		// Creo los diferentes casos en que el número sea negativo y no me sirva, y los
		// otros casos dependiendo del número de cifras
		if (num < 0) {
			System.out.println("Número no válido, pruebe de nuevo");
		} else if (num > 0 && num <= 9) {
			System.out.println("El número es capicúa");
		} else if (num >= 10 && num <= 99) {
			if (num % 10 == num / 10) {
				System.out.println("El número es capicúa");
			} else
				System.out.println("El número no es capicúa");
		} else if (num >= 100 && num <= 999) {
			if (num % 10 == num / 100) {
				System.out.println("El número es capicúa");
			} else
				System.out.println("El número no es capicúa");
		} else if (num >= 1000 && num <= 9999) {
			if ((num%10 == num/1000) &&((num / 10)%10 == (num / 100)%10)) {
				System.out.println("El número es capicúa");
			} else
				System.out.println("El número no es capicúa");
		} else
			System.out.println("Número demasiado grande, intentelo de nuevo");
		// Cerramos el escáner
		reader.close();
	}

}
