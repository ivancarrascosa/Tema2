package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;
		// Creo un booleano que en el momento en el que el número sea divisible entre otro se vuelva true
		boolean divisible = false;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca un número y lo guardamos en la variable
		System.out.println("Introduzca un número para saber si es primo:");
		n = reader.nextInt();
		// Creo un for que vaya comprobando desde el 2 hasta la mitad del número
		// introducido si n módulo cada número es 0, en caso de serlo no será primo
		for (int i = 2 ; i <= n/2 && !divisible ; i++) {
			if (n%i == 0) {
				divisible = true;
			}
		}
		if (divisible) {
			System.out.println("El número no es primo");
		} else {
			System.out.println("El número es primo");
		}
		//Cierro el escáner
		reader.close();

	}

}
